import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {

        IntersectionWorkingTime intersectionWorkingTime = new IntersectionWorkingTime();
        DateTimeFormatter formatterOnlyHoursMinutes = DateTimeFormatter.ofPattern("HH:mm:ss");


        LocalTime officeOpeningTime_1 = LocalTime.of(6, 30);
            System.out.println("1. " + officeOpeningTime_1.format(formatterOnlyHoursMinutes));
        int hours_1 = 10;
        ZoneId zone_1 = ZoneId.of("Europe/Berlin");


        LocalTime officeOpeningTime_2 = LocalTime.of(11, 00);
            System.out.println("2. " + officeOpeningTime_2.format(formatterOnlyHoursMinutes));
        System.out.println();
/*      int hours_2 = 20;
        ZoneId zone_2 = ZoneId.of("Asia/Seoul");*/
        int hours_2 = 8;
        ZoneId zone_2 = ZoneId.of("Europe/Berlin");


        int intersectTime = intersectionWorkingTime.intersectWorkingTime(officeOpeningTime_1, hours_1, zone_1, officeOpeningTime_2, hours_2, zone_2);
            System.out.println();
            System.out.println("3. " + "intersectTime: " + intersectTime);
    }

}
