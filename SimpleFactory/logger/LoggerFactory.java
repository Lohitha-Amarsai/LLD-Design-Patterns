package logger;

public class LoggerFactory {
    public static ILogger createLogger(LogLevel logLevel) {
        switch (logLevel) {
            case DEBUG:
                return new DebugLogger();
            case INFO:
                return new InfoLogger();
            default:
                return null;
        }
    }
}
