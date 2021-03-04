import java.time.*;
import java.time.temporal.ChronoUnit;

public class IntersectionWorkingTime {

    public int intersectWorkingTime(LocalTime start1, int hours1, ZoneId zone1, LocalTime start2, int hours2, ZoneId zone2) {

        ZonedDateTime tempStart1 = convertGivenTimeToUTC(start1, zone1);
            System.out.println("4. " + "Current date and time in a particular office 1 : " + tempStart1);

        ZonedDateTime tempStart2 = convertGivenTimeToUTC(start2, zone2);
            System.out.println("5. " + "Current date and time in a particular office 2 : " + tempStart2);


        ZonedDateTime   tempStart1Closed =   tempStart1.plusHours((long)hours1);  // plus hours
        ZonedDateTime   tempStart2Closed =   tempStart2.plusHours((long)hours2);  // plus hours

        long hoursBetween = ChronoUnit.HOURS.between(tempStart1Closed, tempStart2Closed);  // first possibility

            System.out.println("6. " + "-> Duration: " + Duration.between(tempStart1Closed, tempStart2Closed).toHours()); // first possibility

        if (hoursBetween <= 0)
            return 0;

        return (int) hoursBetween;
    }

    ZonedDateTime convertGivenTimeToUTC(LocalTime start, ZoneId zone) {

        LocalDate localDate = LocalDate.now();  // local request date

        LocalDateTime localDateTime = localDate.atTime(start);  //Add time and Date information

        ZonedDateTime dateAndTimeInOffice = ZonedDateTime.of(localDateTime, zone);
            System.out.println("7. " + "Date and time in a particular office : " + dateAndTimeInOffice);

        ZonedDateTime dateAndTimeInOfficeUTC = dateAndTimeInOffice.withZoneSameInstant(ZoneOffset.UTC);
            System.out.println("8. " + "Date and time in office in UTC : " + dateAndTimeInOfficeUTC);

        return dateAndTimeInOfficeUTC;
    }

}
