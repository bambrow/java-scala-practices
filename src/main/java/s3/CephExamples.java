package s3;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.Protocol;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import lombok.SneakyThrows;

public class CephExamples {

    @SneakyThrows
    public static void main(String[] args) {
        String credPath = "src/main/resources/credentials/ceph.txt";
        S3CredentialReader credReader = new S3CredentialReader(credPath);

        AWSCredentials credentials = new BasicAWSCredentials(credReader.getAccessKey(), credReader.getSecretKey());

        ClientConfiguration clientConfig = new ClientConfiguration();
        clientConfig.setProtocol(Protocol.HTTP);

        AmazonS3 conn = new AmazonS3Client(credentials, clientConfig);
        conn.setEndpoint(credReader.getEndpoint());

        S3ConnectionUtils.listBuckets(conn);
        System.out.println("----------------");
        S3ConnectionUtils.listObjects(conn, "yarn");
        System.out.println("----------------");
        System.out.println(S3ConnectionUtils.getObjectUrl(conn, "yarn", "conf/hadoop/core-site.xml"));
    }

}
