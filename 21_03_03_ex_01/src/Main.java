import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {

/*      Создать LocalDate своего рождения. Вывести день недели, день в году.
        Создать LocalDate своего др в текущем году.
        Создать сегодняшний день и сравнить, что раньше, ваш др или сегодня, и на сколько дней.*/

        LocalDate localDateNow = LocalDate.now();
        System.out.println("localDateNow: " + localDateNow);

        LocalDate localDateSomeDate = LocalDate.parse("2021-03-01");
        System.out.println("localDateSomeDate: " + localDateSomeDate);

//        System.out.println("localDateSomeDate: " + localDateSomeDate.getDayOfWeek());
//        System.out.println("localDateSomeDate: " + localDateSomeDate.getChronology());
//        System.out.println("localDateSomeDate: " + localDateSomeDate.getDayOfMonth());
//        System.out.println("localDateSomeDate: " + localDateSomeDate.getMonth());


/*        LocalDate localDateFirstDate = LocalDate.parse("1918-02-01");
        System.out.println(localDateFirstDate.toString());
        System.out.println(localDateFirstDate.getYear());
        System.out.println(localDateFirstDate.getMonthValue());
        System.out.println(localDateFirstDate.getDayOfMonth());*/

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate startDate = LocalDate.parse("1918-01-01", formatter);
        LocalDate endDate = LocalDate.parse("1918-02-13", formatter);
        Period period = Period.between(startDate, endDate);
        System.out.println(period.getYears());      // 4
        System.out.println(period.getMonths());     // 1
        System.out.println(period.getDays());       // 5

    }
}
