//Basic logging with log4j

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Ex_1_BasicLoggingLog4j {

public static void main (String [] args){

    Logger log = Logger.getLogger("log4j");

    //This configurs logs to console and with pattern layout.
    //in Java.util.logger, you dont need to configure but here in this you need to use configure.
    BasicConfigurator.configure();

    log.info("This is information message");
    log.debug("This is debug message");
    log.warn("This is warning");
    log.error("This is erorr message.");
}
}


