package s3;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.*;
import com.amazonaws.util.StringUtils;

import java.io.File;
import java.io.InputStream;
import java.util.List;

public class S3ConnectionUtils {

    public static void listBuckets(AmazonS3 conn) {
        List<Bucket> buckets = conn.listBuckets();
        for (Bucket bucket : buckets) {
            System.out.println(bucket.getName() + "\t" + StringUtils.fromDate(bucket.getCreationDate()));
        }
    }

    public static Bucket createBucket(AmazonS3 conn, String bucketName) {
        return conn.createBucket(bucketName);
    }

    public static void deleteBucket(AmazonS3 conn, String bucketName) {
        conn.deleteBucket(bucketName);
    }

    public static void listObjects(AmazonS3 conn, String bucketName) {
        ObjectListing objects = conn.listObjects(bucketName);
        do {
            for (S3ObjectSummary objectSummary : objects.getObjectSummaries()) {
                System.out.println(objectSummary.getKey() + "\t" + objectSummary.getSize() + "\t" + StringUtils.fromDate(objectSummary.getLastModified()));
            }
            objects = conn.listNextBatchOfObjects(objects);
        } while (objects.isTruncated());
    }

    public static void putObject(AmazonS3 conn, String bucketName, String objName, InputStream in) {
        conn.putObject(bucketName, objName, in, new ObjectMetadata());
    }

    public static void deleteObject(AmazonS3 conn, String bucketName, String objName) {
        conn.deleteObject(bucketName, objName);
    }

    public static void getObject(AmazonS3 conn, String bucketName, String objName, String targetLoc) {
        conn.getObject(new GetObjectRequest(bucketName, objName), new File(targetLoc));
    }

    public static String getObjectUrl(AmazonS3 conn, String bucketName, String objName) {
        GeneratePresignedUrlRequest request = new GeneratePresignedUrlRequest(bucketName, objName);
        return conn.generatePresignedUrl(request).toString();
    }

}
