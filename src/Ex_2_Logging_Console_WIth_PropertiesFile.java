import org.apache.log4j.Logger;

public class Ex_2_Logging_Console_WIth_PropertiesFile {

    public static void main (String [] args){

        Logger mylogs = Logger.getLogger("mylogs");

        mylogs.warn("This is warning message.");
        mylogs.debug("This is debugg message");

    }



}
