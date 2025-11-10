package logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DomainLogger {
    private final Logger logger;

    private DomainLogger(Class<?> clazz) {
        this.logger = LoggerFactory.getLogger(clazz);
    }

    public static DomainLogger get(Class<?> clazz) {
        return new DomainLogger(clazz);
    }

    public void info(String msg, Object... args) { logger.info(msg, args); }
    public void warn(String msg, Object... args) { logger.warn(msg, args); }
    public void error(String msg, Object... args) { logger.error(msg, args); }
    public void debug(String msg, Object... args) { logger.debug(msg, args); }
    public void trace(String msg, Object... args) { logger.trace(msg, args); }
}