package cs.au.dk.remotetest;

import android.test.InstrumentationTestRunner;

import junit.framework.TestSuite;


import org.json.rpc.client.JsonRpcInvoker;
import org.json.rpc.client.TcpRpcClientTransport;

import java.lang.reflect.Method;
import java.net.URL;


/***
 * This is the entry-point from the remote site.
 */
public class RemoteTestSuiteRunner extends InstrumentationTestRunner implements RemoteProvider {


    TcpRpcClientTransport transport;
    JsonRpcInvoker invoker;

    @Override
    public JsonRpcInvoker getRemoteInvoker() {
        return invoker;
    }

    @Override
    public TcpRpcClientTransport getRemoteTransport() {
        return transport;
    }

    public RemoteTestSuiteRunner() {
        super();

        String portEmulatorServer;
        String portHostServer;

        try {
            Class clazz = null;
            clazz = Class.forName("android.os.SystemProperties");
            Method method = clazz.getDeclaredMethod("get", String.class);
            portEmulatorServer = (String) method.invoke(null, "port.emu");
            portHostServer = (String) method.invoke(null, "port.host");

            /* Set-up the client */
            String url = "http://10.0.2.2:"+portHostServer;
            transport = new TcpRpcClientTransport (new URL(url));
            invoker = new JsonRpcInvoker();

        }
        catch(Exception e){
            throw new RuntimeException("Error setting up the TestRunner" + e);
        }
    }



    @Override
    public TestSuite getTestSuite() {
        TestSuite suite = new TestSuite();
        //TODO: Generic on the activity, get it through reflection
        suite.addTest(new RemoteActivityTest(MainActivity.class, this));
        return suite;
    }

}