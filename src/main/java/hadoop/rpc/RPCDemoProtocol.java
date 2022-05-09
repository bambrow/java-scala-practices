package hadoop.rpc;

import org.apache.hadoop.ipc.VersionedProtocol;

public interface RPCDemoProtocol extends VersionedProtocol {
    long versionID = 1234L;
    void print(String str);
    int add(int x, int y);
}
