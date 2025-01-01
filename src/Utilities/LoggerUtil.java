
package Utilities;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerUtil {
    
    public static void logAction(Class<?> title, String action) {
        Logger logger = LoggerFactory.getLogger(title);
        String currentUser = Database.CurrentUser.getUsername();
        logger.info("Action: {} performed by user: {}", action, currentUser);
    }
}
