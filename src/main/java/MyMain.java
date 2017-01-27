import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;


public class MyMain {
    public static void main(String[] args){
        Logger logger = LoggerFactory.getLogger( "Syslogger" );
        logger.info("Hello World");

	LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
	StatusPrinter.print(lc);
    }
}
