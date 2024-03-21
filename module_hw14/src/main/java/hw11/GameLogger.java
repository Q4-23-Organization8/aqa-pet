package hw11;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GameLogger {
    private static final Logger logger = LoggerFactory.getLogger(GameLogger.class);

    public void doSomething() {
        logger.debug("Debug message");
        logger.info("Info message");
        logger.warn("Warning message");
        logger.error("Error message");
    }
}
