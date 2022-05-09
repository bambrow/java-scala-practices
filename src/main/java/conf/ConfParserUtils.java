package conf;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Properties;

public class ConfParserUtils {

    public static void parseConfigs(String file) throws IOException {
        Properties props = new Properties();
        InputStreamReader isr = new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8);
        props.load(isr);
        for (Map.Entry<Object, Object> item : props.entrySet()) {
            String key = item.getKey().toString().trim();
            String value = item.getValue().toString().trim();
            System.out.println("key: " + key + ", value: " + value);
        }
    }

}
