// Generate log file based in timestamp. Java.time is good api for datetime manipulations.

import org.apache.log4j.Logger;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoUnit;

public class Ex_3_Logging_File_Console_both {

    public static void main(String[] args) {


        System.setProperty("timestamp",currentTime());

        Logger mylogs= Logger.getLogger("mylogs");
        mylogs.debug("This is a debug message.");
        mylogs.warn("This is warning");
        mylogs.error("you are gone");
        mylogs.info("This is for your information.");

    }

    public static String currentTime() {
        LocalDateTime localDateTime =  LocalDateTime.now().truncatedTo(ChronoUnit.SECONDS);
        String timestamp = localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd-hh-mm-ss"));
    return timestamp;
    };

}
