import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {

    public static void main(String[] args) throws InterruptedException {

        int count = 10;

        BankThread[] bankThreads = new BankThread[count];
        List<BankThread> listEmployee = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            bankThreads[i] = new BankThread(listEmployee, "00" + (i + 1));
            bankThreads[i].start();
        }

        for (int i = 0; i < count; i++) {
            bankThreads[i].join();
        }

        System.out.println("Done!! Print Your Tarakan - List:");

        Collections.sort(listEmployee);
        BankThread temp = listEmployee.get(0);

        for (BankThread item : listEmployee) {
            System.out.println("[" + item.getNickname() + ": "
                    + " time: " + item.getWholeTimeForAllTimes() + " ms."
                    + "]");
        }

        System.out.println();
        System.out.println(
                "Tarakan: " + temp.getNickname()
                + " won wit the time: " + temp.getWholeTimeForAllTimes()
        );
    }

}
