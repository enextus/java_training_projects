import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class IntersectionWorkingTime {

    public int intersectWorkingTime(LocalTime start1, int hours, ZoneId zone1, LocalTime start2, int hours2, ZoneId zone2) {

        //

        return 0;
    }

    public ZonedDateTime convertGivenTimeToUTC(LocalTime start, int hours, ZoneId zone) {

        // https://zetcode.com/java/localtime/

/*        ZoneId australia = zone; // ZoneId.of("Australia/Sydney");

        String str = "2015-01-05 17:00";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime localDateAndTime = LocalDateTime.parse(str, formatter);

        ZonedDateTime dateAndTimeInSydney = ZonedDateTime.of(localDateAndTime, australia );
        System.out.println("Current date and time in a particular timezone : " + dateAndTimeInSydney);

        ZonedDateTime utcDate = dateAndTimeInSydney.withZoneSameInstant(ZoneOffset.UTC);
        System.out.println("Current date and time in UTC : " + utcDate);*/

        ZoneId zone1 = ZoneId.of("Europe/Bratislava");
        ZoneId zone2 = ZoneId.of("Europe/Moscow");

        LocalTime now1 = LocalTime.now(zone1);
        LocalTime now2 = LocalTime.now(zone2);

        System.out.printf("Bratislava time: %s%n", now1);
        System.out.printf("Moscow time: %s%n", now2);

        long hoursBetween = ChronoUnit.HOURS.between(now1, now2);
        long minutesBetween = ChronoUnit.MINUTES.between(now1, now2);

        System.out.println(hoursBetween);
        System.out.println(minutesBetween);

        return null;
    }
}
