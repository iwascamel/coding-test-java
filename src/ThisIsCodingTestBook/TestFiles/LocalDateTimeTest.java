package ThisIsCodingTestBook.TestFiles;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class LocalDateTimeTest {

    static final int MINUTES_PER_HOUR = 60;
    static final int SECONDS_PER_MINUTE = 60;
    static final int SECONDS_PER_HOUR = SECONDS_PER_MINUTE * MINUTES_PER_HOUR;

    public static void main(String args[]){
        LocalDateTime deadlineTime = LocalDateTime.of(2020, 10, 9, 19, 46, 45);
        LocalDateTime fromDateTime = LocalDateTime.of(2020, 12, 9, 7, 45, 55);

        LocalDateTime now = LocalDateTime.now();

        Period period = getPeriod(now, deadlineTime);
        long time[] = getTime(now, deadlineTime);
        int hours = Math.abs((int) time[0]) * 144000;
        int minutes = Math.abs((int) time[1]) * 60000;
        int seconds = Math.abs((int) time[2]) * 1000;

        int miili = hours+minutes+seconds;

        long hours1 = TimeUnit.MILLISECONDS.toHours(miili);
        long minutes2 = TimeUnit.MILLISECONDS.toMinutes(miili);
        long seconds3 = TimeUnit.MILLISECONDS.toSeconds(miili);

        System.out.println(hours1+"   " +minutes2+"   "+seconds3);


        SimpleDateFormat sdf = new SimpleDateFormat("-MM-dd HH:mm:ss.SSS");

        long timeInMillis =miili;

        Date timeInDate = new Date(timeInMillis);
        String timeInFormat = sdf.format(timeInDate);

        System.out.println(timeInFormat);



    }
    private static Period getPeriod(LocalDateTime dob, LocalDateTime now) {
        return Period.between(dob.toLocalDate(), now.toLocalDate());
    }

    private static long[] getTime(LocalDateTime dob, LocalDateTime now) {
        LocalDateTime today = LocalDateTime.of(now.getYear(),
                now.getMonthValue(), now.getDayOfMonth(), dob.getHour(), dob.getMinute(), dob.getSecond());
        Duration duration = Duration.between(today, now);

        long seconds = duration.getSeconds();

        long hours = seconds / SECONDS_PER_HOUR;
        long minutes = ((seconds % SECONDS_PER_HOUR) / SECONDS_PER_MINUTE);
        long secs = (seconds % SECONDS_PER_MINUTE);

        return new long[]{hours, minutes, secs};
    }
}
