package okhttp;

import okhttp3.*;

import java.io.IOException;

public class YarnHAOkHttpDemo {

    public static OkHttpClient client = new OkHttpClient().newBuilder()
            .followRedirects(true)
            .followSslRedirects(true)
            .build();
    public static String yarnUrl = "http://yarn-ingress/ws/v1/cluster/scheduler-conf";

    public static Request createRequest(String method, RequestBody body) {
        return new Request.Builder()
                .url(yarnUrl)
                .method(method, body)
                .addHeader("Accept", "application/xml")
                .addHeader("Content-Type", "application/xml")
                .build();
    }

    public static Request createGetRequest(RequestBody body) {
        return createRequest("GET", body);
    }

    public static Request createPutRequest(RequestBody body) {
        return createRequest("PUT", body);
    }

    public static void main(String[] args) throws IOException {
        // create queue
        {
            String xmlPath = "src/main/resources/okhttp/yarn_add_queue.xml";
            MediaType mediaType = MediaType.parse("application/xml");
            RequestBody body = RequestBody.create(mediaType, YarnXmlReader.readXml(xmlPath));
            Request request = createPutRequest(body);
            Response response = client.newCall(request).execute();
            System.out.println("Add queue: " + (response.body() == null ? null : response.body().string()));
            while (response.body() != null && response.code() == 307) {
                response = client.newCall(request).execute();
                System.out.println("Add queue: " + (response.body() == null ? null : response.body().string()));
            }
        }

        // update queue
        for (int i = 0; i < 100; i++) {
            String xmlPath = "src/main/resources/okhttp/yarn_update_queue.xml";
            MediaType mediaType = MediaType.parse("application/xml");
            RequestBody body = RequestBody.create(mediaType, YarnXmlReader.readXml(xmlPath));
            Request request = createPutRequest(body);
            Response response = client.newCall(request).execute();
            System.out.println("Update queue {" + i  + "}: " + (response.body() == null ? null : response.body().string()));
            while (response.body() != null && response.code() == 307) {
                response = client.newCall(request).execute();
                System.out.println("Update queue {" + i  + "}: " + (response.body() == null ? null : response.body().string()));
            }
        }

        // stop and remove queue
        {
            String xmlPath = "src/main/resources/okhttp/yarn_stop_queue.xml";
            MediaType mediaType = MediaType.parse("application/xml");
            RequestBody body = RequestBody.create(mediaType, YarnXmlReader.readXml(xmlPath));
            Request request = createPutRequest(body);
            Response response = client.newCall(request).execute();
            System.out.println("Stop queue: " + (response.body() == null ? null : response.body().string()));
            while (response.body() != null && response.code() == 307) {
                response = client.newCall(request).execute();
                System.out.println("Stop queue: " + (response.body() == null ? null : response.body().string()));
            }
        }
        {
            String xmlPath = "src/main/resources/okhttp/yarn_remove_queue.xml";
            MediaType mediaType = MediaType.parse("application/xml");
            RequestBody body = RequestBody.create(mediaType, YarnXmlReader.readXml(xmlPath));
            Request request = createPutRequest(body);
            Response response = client.newCall(request).execute();
            System.out.println("Remove queue: " + (response.body() == null ? null : response.body().string()));
            while (response.body() != null && response.code() == 307) {
                response = client.newCall(request).execute();
                System.out.println("Remove queue: " + (response.body() == null ? null : response.body().string()));
            }
        }
    }

}
