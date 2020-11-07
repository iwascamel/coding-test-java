package ThisIsCodingTestBook.TestFiles;

import java.time.Duration;
import java.time.LocalDateTime;

public class LocalDateTimeTest3 {
    public static void main(String args[]){

        LocalDateTime now = LocalDateTime.of(2020,11,10,10,20,10);

        LocalDateTime today = LocalDateTime.now();
        Duration duration = Duration.between(today, now);
        System.out.println(duration.getSeconds());

    }
}
