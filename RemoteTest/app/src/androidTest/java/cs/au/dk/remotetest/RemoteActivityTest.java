package cs.au.dk.remotetest;

import android.app.Activity;
import android.app.Instrumentation;
import android.os.StrictMode;
import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;

import com.robotium.solo.Solo;

import junit.framework.TestSuite;

import org.json.rpc.client.JsonRpcInvoker;
import org.json.rpc.client.TcpRpcClientTransport;
import org.json.rpc.commons.RpcIntroSpection;
import org.json.rpc.server.JsonRpcExecutor;
import org.json.rpc.server.TcpServerTransport;
import org.testng.reporters.jq.Main;

import java.lang.reflect.Method;
import java.net.URL;
import java.util.concurrent.Semaphore;

import dk.au.cs.thor.remoteTestInterface.SoloInterface;
import dk.au.cs.thor.remoteTestInterface.TestInterface;


public class RemoteActivityTest <T extends android.app.Activity> extends ActivityInstrumentationTestCase2<T> {

    private final String TAG = "RemoteActivityTest";

    //private TcpRpcClientTransport transport;
    //private JsonRpcInvoker invoker;

    /* The semaphore */
    private Semaphore s = new Semaphore(0);
    private boolean testEnded = false;


    private class RTImplementation implements TestInterface {

        public RTImplementation() {

        }

        //TODO: R needs to be taken through reflection, if needed to be done dynamically


        @Override
        public void endTest() {
            testEnded = true;
            s.release();
        }

        @Override
        public String[] getRstringsNames() {
            return new String[0];
        }

        @Override
        public String getRstring(String s) {
            return null;
        }

        @Override
        public String[] getRIntNames() {


            return new String[0];
        }

        @Override
        public int getRInt(String s) {
            return 0;
        }

    }



    public RemoteActivityTest() {
        super((Class<T>)MainActivity.class); //TODO: This need to be taken at runtime
    }



    public void setUp() {

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        String portEmulatorServer = null;
        String portHostServer = null;
        final Activity activity = getActivity();
        final Instrumentation instrumentation = getInstrumentation(); //TODO:Activity and instrumentation may be not ready if set at runtime

        try {
            Class clazz = null;
            clazz = Class.forName("android.os.SystemProperties");
            Method method = clazz.getDeclaredMethod("get", String.class);
            portEmulatorServer = (String) method.invoke(null, "port.emu");
            portHostServer = (String) method.invoke(null, "port.host");

            /* Set-up the client, not needed yet */
            //String url = "http://10.0.2.2:"+portHostServer;
            //transport = new TcpRpcClientTransport (new URL(url));
            //invoker = new JsonRpcInvoker();

            /* Set-up the server */
            Log.d(TAG, "Setting up the server");
            final String portEmuServerFinal = portEmulatorServer;
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    final SoloProxy solo = new SoloProxy(instrumentation,activity);
                    JsonRpcExecutor executor = new JsonRpcExecutor();
                    executor.addHandler("solo", solo , SoloInterface.class);
                    executor.addHandler("rti", new RTImplementation(), TestInterface.class);
                    Log.d(TAG, "Remote object added");
                    TcpServerTransport transport = new TcpServerTransport(Integer.parseInt(portEmuServerFinal));
                    while(true) { //Respawn the tcp server until the test is finished
                        if(testEnded) break;
                        Log.d(TAG, "Ready to execute");
                        executor.execute(transport); //TODO: The exceptions need to be passed back here for spoon
                        //TODO: Respawn the transport if it goes down ?
                    }

                }
            });

            t.start();

        }
        catch(Exception e){
            throw new RuntimeException("Error setting up the TestRunner on port " + portHostServer + " " + e + "\n" + Log.getStackTraceString(e));

        }

    }


    public void testEntry() {

        try {
            Log.d(TAG, "Test started, now acquiring");
            // Giving the "control" to someone else
            s.acquire();
        }
        catch(Exception e) {
            Log.e(TAG, "Error while acquiring", e);
        }

    }
}
