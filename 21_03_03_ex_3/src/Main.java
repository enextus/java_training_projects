import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {

        IntersectionWorkingTime intersectionWorkingTime = new IntersectionWorkingTime();
        DateTimeFormatter formatterOnlyHoursMinutes = DateTimeFormatter.ofPattern("HH:mm:ss");


        LocalTime officeOpeningTime_1 = LocalTime.of(6, 00);
            System.out.println("1. " + officeOpeningTime_1.format(formatterOnlyHoursMinutes));
        int hours_1 = 8;
        ZoneId zone_1 = ZoneId.of("Europe/Berlin");


        LocalTime officeOpeningTime_2 = LocalTime.of(7, 00);
            System.out.println("2. " + officeOpeningTime_2.format(formatterOnlyHoursMinutes));
        System.out.println();
/*      int hours_2 = 20;
        ZoneId zone_2 = ZoneId.of("Asia/Seoul");*/
        int hours_2 = 6;
        ZoneId zone_2 = ZoneId.of("Europe/Berlin");


        int intersectTime = intersectionWorkingTime.intersectWorkingTime(officeOpeningTime_1, hours_1, zone_1, officeOpeningTime_2, hours_2, zone_2);
            System.out.println();
            System.out.println("3. " + "intersectTime: " + intersectTime);
    }

}

/*
1. 06:00:00
2. 07:00:00

7. Date and time in a particular office : 2021-03-04T06:00+01:00[Europe/Berlin]
8. Date and time in office in UTC : 2021-03-04T05:00Z
4. Current date and time in a particular office 1 : 2021-03-04T05:00Z
7. Date and time in a particular office : 2021-03-04T07:00+01:00[Europe/Berlin]
8. Date and time in office in UTC : 2021-03-04T06:00Z
5. Current date and time in a particular office 2 : 2021-03-04T06:00Z
6-open. -> Duration between open time: 1
6-close. -> Duration between close time: -1

3. intersectTime: 1

Process finished with exit code 0
*/
