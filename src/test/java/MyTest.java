import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import org.junit.Test;


public class MyTest {
    @Test
    public void loggertest(){
        Logger logger = LoggerFactory.getLogger( "Syslogger" );
        logger.info("Hello World");

	LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
	StatusPrinter.print(lc);
    }
}
