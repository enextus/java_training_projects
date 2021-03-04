import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class IntersectionWorkingTime {

    public int intersectWorkingTime(LocalTime start1, int hours, ZoneId zone1, LocalTime start2, int hours2, ZoneId zone2) {

        ZonedDateTime tempStart1 = convertGivenTimeToUTC(start1, zone1);
        System.out.println("Current date and time in a particular timezone 1 : " + tempStart1);

        ZonedDateTime tempStart2 = convertGivenTimeToUTC(start2, zone2);
        System.out.println("Current date and time in a particular timezone 2 : " + tempStart2);

        long hoursBetween = ChronoUnit.HOURS.between(tempStart1, tempStart2);

        if (hoursBetween <= 0)
            return 0;

        return (int) hoursBetween;
    }

    public ZonedDateTime convertGivenTimeToUTC(LocalTime start, ZoneId zone) {

        LocalDate localDate = LocalDate.now();  //local date
        LocalDateTime localDateTime = localDate.atTime(start);  //Add time and Date information

        ZonedDateTime dateAndTimeInSydney = ZonedDateTime.of(localDateTime, zone);
        System.out.println("Current date and time in a particular timezone : " + dateAndTimeInSydney);

        ZonedDateTime utcDate = dateAndTimeInSydney.withZoneSameInstant(ZoneOffset.UTC);
        System.out.println("Current date and time in UTC : " + utcDate);

        return utcDate;
    }

}
