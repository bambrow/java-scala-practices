package log4j;

import org.apache.log4j.Logger;

public class Log4jDemo {
    private static final Logger log = Logger.getLogger(Log4jDemo.class);
    public static void main(String[] args) {
        log.debug("debug message");
        log.info("info message");
        log.warn("warn message");
        log.error("error message");
        log.fatal("fatal message");
    }
}
