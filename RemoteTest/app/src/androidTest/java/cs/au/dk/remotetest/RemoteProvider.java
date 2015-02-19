package cs.au.dk.remotetest;


import org.json.rpc.client.JsonRpcInvoker;
import org.json.rpc.client.TcpRpcClientTransport;

public interface RemoteProvider {
    public JsonRpcInvoker getRemoteInvoker();
    public TcpRpcClientTransport getRemoteTransport();
}
