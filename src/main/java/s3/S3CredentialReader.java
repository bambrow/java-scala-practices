package s3;

import lombok.Data;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

@Data
public class S3CredentialReader {
    private String endpoint;
    private String accessKey;
    private String secretKey;

    public S3CredentialReader(String path) throws IOException {
        List<String> credList = Files.readAllLines(Paths.get(path));
        this.endpoint = credList.get(0).trim();
        this.accessKey = credList.get(1).trim();
        this.secretKey = credList.get(2).trim();
    }
}
