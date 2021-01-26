package this_is_coding_test_book.test_files;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;

public class LocalDateTimeTest2 {
    static final int MINUTES_PER_HOUR = 60;
    static final int SECONDS_PER_MINUTE = 60;
    static final int SECONDS_PER_HOUR = SECONDS_PER_MINUTE * MINUTES_PER_HOUR;
    public static void main(String args[]){

        LocalDateTime deadlineTime = LocalDateTime.of(2020,11,03,20,33,21);
        LocalDateTime now = LocalDateTime.now();

        Period period = getPeriod(now, deadlineTime);
        long time[] = getTime(now, deadlineTime);
        int years = Math.abs(period.getYears());
        int months = Math.abs(period.getMonths()) + years*12;
        int days = Math.abs(period.getDays()) + months*30;
        int hours = Math.abs((int) time[0]) + days*24;
        int minutes = Math.abs((int) time[1]);
        int seconds = Math.abs((int) time[2]);



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
