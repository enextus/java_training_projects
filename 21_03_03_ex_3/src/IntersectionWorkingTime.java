import java.time.*;
import java.time.format.DateTimeFormatter;

public class IntersectionWorkingTime {

    public int intersectWorkingTime(LocalTime start1, int hours, ZoneId zone1, LocalTime start2, int hours2, ZoneId zone2) {

        //

        return 0;
    }

    public ZonedDateTime convertGivenTimeToUTC(LocalTime start, int hours, ZoneId zone) {

        ZoneId australia = ZoneId.of("Australia/Sydney");
        String str = "2015-01-05 17:00";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime localDateAndTime = LocalDateTime.parse(str, formatter);


        ZonedDateTime dateAndTimeInSydney = ZonedDateTime.of(localDateAndTime, australia );
        System.out.println("Current date and time in a particular timezone : " + dateAndTimeInSydney);


        ZonedDateTime utcDate = dateAndTimeInSydney.withZoneSameInstant(ZoneOffset.UTC);
        System.out.println("Current date and time in UTC : " + utcDate);

        return null;
    }
}
