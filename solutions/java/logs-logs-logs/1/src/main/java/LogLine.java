public class LogLine {

    private final LogLevel level;
    private final String logLine;

    public LogLine(String logLine) {

        this.logLine = logLine;
        String code = logLine.substring(1, 4);

        switch (code) {
            case "TRC" -> this.level = LogLevel.TRACE;
            case "DBG" -> this.level = LogLevel.DEBUG;
            case "INF" -> this.level = LogLevel.INFO;
            case "WRN" -> this.level = LogLevel.WARNING;
            case "ERR" -> this.level = LogLevel.ERROR;
            case "FTL" -> this.level = LogLevel.FATAL;
            default -> this.level = LogLevel.UNKNOWN;
        }
    }

    public LogLevel getLogLevel() {
        return this.level;
    }

    public String getOutputForShortLog() {
        String message = logLine.substring(logLine.indexOf(": ") + 2);
        return level.getLevel() + ":" + message;
    }
}
