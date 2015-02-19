package cs.au.dk.remotetest;

import android.test.ActivityInstrumentationTestCase2;

import org.json.rpc.commons.RpcIntroSpection;
import org.testng.reporters.jq.Main;

public class RemoteActivityTest <T extends android.app.Activity> extends ActivityInstrumentationTestCase2<T> {

    RemoteProvider remote;

    public RemoteActivityTest(Class c, RemoteProvider rem) {
        super(c);
        remote = rem;
    }

    public void testEntry() {
        RpcIntroSpection sample = remote.getRemoteInvoker().get(remote.getRemoteTransport(),"system", RpcIntroSpection.class);
        System.out.println(sample.listMethods());

    }
}
