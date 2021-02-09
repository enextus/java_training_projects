import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {

    public static void main(String[] args) throws InterruptedException {

        ArrayList<Employee> listEmployee = new ArrayList<Employee>();
        listEmployee.add(new Employee("tanya", 100, 200, false));
        listEmployee.add(new Employee("vasya", 200, 300, true));
        listEmployee.add(new Employee("petya", 200, 300, false));





        int count = 20;

        BankThread[] bankThreads = new BankThread[count];
        List<BankThread> bankThreadList = new ArrayList<>();


        for (int i = 0; i < count; i++) {
            //   bankThreads[i] = new BankThread(listEmployee, "00" + (i + 1));
            bankThreads[i] = null;
            bankThreads[i].start();
        }

        for (int i = 0; i < count; i++) {
            bankThreads[i].join();
        }

        System.out.println();
        System.out.println("Done. Print Your employees - List:");

        Collections.sort(bankThreadList);
        BankThread temp = bankThreadList.get(0);

/*        for (BankThread item : bankThreadList) {
           System.out.println("[" + item.getNickname() + ": "
                    + " time: " + item.getWholeTimeForAllContracts() + " ms."
                    + "]");
        }

        System.out.println();
        System.out.println(
                "Employee: " + temp.getNickname()
                        + " \n" +
                        "was the fastest with the time: " + temp.getWholeTimeForAllContracts()
        );*/
    }

}
