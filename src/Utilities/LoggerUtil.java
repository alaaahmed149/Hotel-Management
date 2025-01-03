
package Utilities;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerUtil {
    public static void logAction(Class<?> title, String action) {
        Logger logger = LoggerFactory.getLogger(title);
        logger.info("Class: {} Action: {}",title, action);
    }
    public static void logError(Class<?> title, String message, Throwable throwable) {
        Logger logger = LoggerFactory.getLogger(title);
        logger.error("Class: {} Error: {}", title, message + " " + throwable);
    }
    public static void logWarn(Class<?> title, String message) {
        Logger logger = LoggerFactory.getLogger(title);
        logger.warn("Class: {} Warning: {}", title, message);
    }
}
