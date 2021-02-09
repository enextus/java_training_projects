import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) throws InterruptedException {

        Work work = new Work(20);

        int numberOfCompletedContracts = work.getNumberOfCompletedContracts();

        ArrayList<Employee> listEmployee = new ArrayList<Employee>();
        listEmployee.add(new Employee("tanya", 100, 200, false));
        listEmployee.add(new Employee("vasya", 200, 300, true));
        listEmployee.add(new Employee("petya", 200, 300, false));

        System.out.println("listEmployee.size(): " + listEmployee.size());
        System.out.println("listEmployee: " + listEmployee);

        for (Employee emp : listEmployee
        ) {
            System.out.println("emp: " + emp);
        }

        //  Employees list done

        BankThread[] bankThreads = new BankThread[numberOfCompletedContracts];
        // array of bankThreads done

        List<BankThread> bankThreadsList = new ArrayList<>();
        // list of bank threads

        for (Employee emp : listEmployee) {

            for (int i = 0; i < numberOfCompletedContracts; i++) {
                bankThreads[i] = new BankThread(emp, (i + 1));
                bankThreads[i].start();
            }

        }

        for (int i = 0; i < numberOfCompletedContracts; i++) {
            bankThreads[i].join();
        }




        System.out.println("bank thread are started");
        // bank thread are started



/*
        System.out.println();
        System.out.println("Done. Print Your employees - List:");
        Collections.sort(bankThreadsList);
        BankThread temp = bankThreadsList.get(0);

       for (BankThread item : bankThreadList) {
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
