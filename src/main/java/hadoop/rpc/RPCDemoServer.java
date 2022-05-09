package hadoop.rpc;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.ProtocolSignature;
import org.apache.hadoop.ipc.RPC;

import java.io.IOException;

public class RPCDemoServer implements RPCDemoProtocol {
    public static void main(String[] args) throws IOException {
        RPC.Server server = new RPC.Builder(new Configuration())
                .setBindAddress("localhost")
                .setPort(6969)
                .setProtocol(RPCDemoProtocol.class)
                .setNumHandlers(5)
                .setInstance(new RPCDemoServer())
                .build();
        System.out.println("Server starting...");
        server.start();
    }

    @Override
    public void print(String str) {
        System.out.println("Server gets: " + str);
    }

    @Override
    public int add(int x, int y) {
        return x + y;
    }

    @Override
    public long getProtocolVersion(String s, long l) {
        return RPCDemoProtocol.versionID;
    }

    @Override
    public ProtocolSignature getProtocolSignature(String s, long l, int i) {
        return new ProtocolSignature(RPCDemoProtocol.versionID, null);
    }
}
