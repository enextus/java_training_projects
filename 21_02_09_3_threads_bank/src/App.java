public class App {

    public static void main(String[] args) throws InterruptedException {


        Employee e1 = new Employee("tanya", 100, 200, false);
        Employee e2 = new Employee("vasya", 200, 300, true);
        Employee e3 = new Employee("petya", 200, 300, false);





/*
        int count = 10;

        BankThread[] bankThreads = new BankThread[count];
        List<BankThread> listEmployee = new ArrayList<>();

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

        Collections.sort(listEmployee);
        BankThread temp = listEmployee.get(0);*/

/*        for (BankThread item : listEmployee) {
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
