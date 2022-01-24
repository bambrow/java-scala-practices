package okhttp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class YarnXmlReader {
    public static String readXml(String path) throws IOException {
        return String.join("\n", Files.readAllLines(Paths.get(path)));
    }
}
