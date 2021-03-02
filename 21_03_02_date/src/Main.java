import java.time.LocalDate;
import java.time.Period;
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


        System.out.println(tomorrow);
    }
}
