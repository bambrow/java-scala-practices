package conf;

import java.io.IOException;

public class ConfParserDemo {

    public static void main(String[] args) throws IOException {
        String confPath = "src/main/resources/parser/spark-defaults.example.conf";
        ConfParserUtils.parseConfigs(confPath);
    }

}
