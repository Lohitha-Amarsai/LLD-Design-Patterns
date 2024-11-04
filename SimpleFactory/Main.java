import logger.*;

public class Main {
    public static void main(String[] args) {
        ILogger debugLogger = LoggerFactory.createLogger(LogLevel.DEBUG);
        ILogger infoLogger = LoggerFactory.createLogger(LogLevel.INFO);

        debugLogger.log("This is a debug log msg");
        infoLogger.log("This is an info log msg");
    }
}