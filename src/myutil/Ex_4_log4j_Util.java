//Creating logger util , so it can be used across all class.
// Key is , when you access static variable or method first time, it will initialise the static block.
//anthor , way to create a class with constructor to intialise it. then use it.
package myutil;

import org.apache.log4j.Logger;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Ex_4_log4j_Util {
    public static Logger mylogs;

    static {
        LocalDateTime localDateTime =  LocalDateTime.now().truncatedTo(ChronoUnit.SECONDS);
        String timestamp = localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd-hh-mm-ss"));
        System.setProperty("timestamp",timestamp);
        mylogs = Logger.getLogger("mylogs");
    }




}
