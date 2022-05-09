package hadoop.rpc;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.RPC;

import java.io.IOException;
import java.net.InetSocketAddress;

public class RPCDemoClient {
    public static void main(String[] args) throws IOException {
        RPCDemoProtocol client = RPC.getProxy(
                RPCDemoProtocol.class,
                RPCDemoProtocol.versionID,
                new InetSocketAddress("localhost", 6969),
                new Configuration());
        System.out.println("Client starting...");
        client.print("hello world");
        System.out.println(client.add(1, 2));
        RPC.stopProxy(client);
    }
}
