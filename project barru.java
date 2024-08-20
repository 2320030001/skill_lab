class Logger {
    private Logger() {}
    private static Logger instance = new Logger();
    public static Logger getInstance() {
        return instance;
    }
    public enum Level {
        DEBUG, INFO, WARNING, ERROR, FATAL
    }
    public void log(Level level, String message) {
        System.out.println(level + ": " + message);
    }
    public void debug(String message) {
        log(Level.DEBUG, message);
    }
    public void info(String message) {
        log(Level.INFO, message);
    }
    public void warn(String message) {
        log(Level.WARNING, message);
    }
    public void error(String message) {
        log(Level.ERROR, message);
    }
    public void fatal(String message) {
        log(Level.FATAL, message);
    }
}