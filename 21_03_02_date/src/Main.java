import java.time.*;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String[] args) {
        // write your code here


        LocalDate now = LocalDate.now();

        System.out.println(now);

        LocalDate tomorrow = now.plus(Period.ofDays(1));

        System.out.println(tomorrow);

        tomorrow = now.plusDays(1);

        tomorrow = now.plus(1, ChronoUnit.DAYS);

        System.out.println(tomorrow);
        tomorrow = now.plus(1, ChronoUnit.MONTHS);

        System.out.println(tomorrow);

        System.out.println(now.getDayOfWeek());
        System.out.println(tomorrow);

        System.out.println(now.isAfter(tomorrow));
        System.out.println(now.isBefore(tomorrow));

        //LocalTime
        LocalTime currentTime = LocalTime.now();
        LocalTime nextHour = currentTime.plus(Duration.ofHours(1));

        nextHour = currentTime.plus(1, ChronoUnit.HOURS);   // вернет новый локалтиме  ДЛЯ + И -

        System.out.println(nextHour);

        nextHour = currentTime.plusHours(1);
        System.out.println(nextHour);


        // LocalDateTime
        LocalDateTime today = LocalDateTime.now();
        LocalDateTime todayParsed = LocalDateTime.parse("2021-03-02T12:26:24");

        System.out.println(today);
        System.out.println(todayParsed);

        System.out.println(todayParsed.get(ChronoField.DAY_OF_YEAR));

    }
}
