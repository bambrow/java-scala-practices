package charset;

import lombok.SneakyThrows;
import org.mozilla.universalchardet.UniversalDetector;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class FileEncodingGuesser {

    public static String guessEncoding(byte[] bytes) {
        String DEFAULT_ENCODING = "UTF-8";
        UniversalDetector detector = new UniversalDetector(null);
        detector.handleData(bytes, 0, bytes.length);
        detector.dataEnd();
        String encoding = detector.getDetectedCharset();
        detector.reset();
        if (encoding == null) {
            encoding = DEFAULT_ENCODING;
        }
        return encoding;
    }

    public static String guessEncoding(String path) throws IOException {
        byte[] data = Files.readAllBytes(Paths.get(path));
        return guessEncoding(data);
    }

    public static List<String> readWithoutGuessing(String path) throws IOException {
        BufferedReader reader = Files.newBufferedReader(Paths.get(path));
        return reader.lines().filter(x -> x.length() > 0).collect(Collectors.toList());
    }

    public static List<String> readWithGuessing(String path) throws IOException {
        String encoding = guessEncoding(path);
        BufferedReader reader = Files.newBufferedReader(Paths.get(path), Charset.forName(encoding));
        return reader.lines().filter(x -> x.length() > 0).collect(Collectors.toList());
    }

    @SneakyThrows
    public static void main(String[] args) {
        System.out.println(guessEncoding("说不定睡一觉会有灵感".getBytes("GBK")));
        System.out.println(guessEncoding("说不定睡一觉会有灵感".getBytes(StandardCharsets.UTF_8)));
        System.out.println(guessEncoding("说不定睡一觉会有灵感".getBytes(StandardCharsets.UTF_16)));
        System.out.println(readWithGuessing("src/main/resources/encoding.txt"));
    }

}
