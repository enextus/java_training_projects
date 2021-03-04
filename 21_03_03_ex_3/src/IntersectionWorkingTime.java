import java.time.*;
import java.time.format.DateTimeFormatter;

public class IntersectionWorkingTime {

    public int intersectWorkingTime(LocalTime start1, int hours, ZoneId zone1, LocalTime start2, int hours2, ZoneId zone2) {


        ZonedDateTime tempStart1 = convertGivenTimeToUTC(start1, zone1);

        ZonedDateTime dateAndTimeInSydney = ZonedDateTime.of(tempStart1, zone1);
        System.out.println("Current date and time in a particular timezone : " + dateAndTimeInSydney);

        /*

        long hoursBetween = ChronoUnit.HOURS.between(now1, now2);
        long minutesBetween = ChronoUnit.MINUTES.between(now1, now2);

        System.out.println("HERE1");

        System.out.println(hoursBetween);
        System.out.println(minutesBetween);

        System.out.println("HERE2");*/

        return 0;
    }

    public ZonedDateTime convertGivenTimeToUTC(LocalTime start, ZoneId zone) {

        // https://zetcode.com/java/localtime/

        String str = "2015-01-05 17:00";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime localDateAndTime = LocalDateTime.parse(str, formatter);

        ZonedDateTime dateAndTimeInSydney = ZonedDateTime.of(localDateAndTime, zone);
        System.out.println("Current date and time in a particular timezone : " + dateAndTimeInSydney);

        ZonedDateTime utcDate = dateAndTimeInSydney.withZoneSameInstant(ZoneOffset.UTC);
        System.out.println("Current date and time in UTC : " + utcDate);

        return utcDate;
    }
}
