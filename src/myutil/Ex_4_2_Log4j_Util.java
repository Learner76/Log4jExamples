// Calling util logger for loggin purpose.
package myutil;
import static myutil.Ex_4_log4j_Util.mylogs;

public class Ex_4_2_Log4j_Util {

    public static void main(String[] args) {
        mylogs.debug("This is a debug message.");
        mylogs.warn("This is warning");
        mylogs.error("you are gone");
        mylogs.info("This is for your information.");
        mylogs.info("Print from another class.");

    }
}
