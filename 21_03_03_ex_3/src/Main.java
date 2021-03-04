import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {

        IntersectionWorkingTime intersectionWorkingTime = new IntersectionWorkingTime();

        DateTimeFormatter formatterOnlyHoursMinutes = DateTimeFormatter.ofPattern("HH:mm");

        LocalTime officeOpeningTime_1 = LocalTime.of(9, 30);
        System.out.println(officeOpeningTime_1.format(formatterOnlyHoursMinutes));
        int hours_1 = 8;
        ZoneId zone_1 = ZoneId.of("Europe/Berlin");

        LocalTime officeOpeningTime_2 = LocalTime.of(10, 0);
        System.out.println(officeOpeningTime_2.format(formatterOnlyHoursMinutes));
        int hours_2 = 6;
        ZoneId zone_2 = ZoneId.of("Asia/Seoul");


        intersectionWorkingTime.intersectWorkingTime(officeOpeningTime_1, hours_1, zone_1, officeOpeningTime_2, hours_2, zone_2);



    }
}
