import java.util.Collections;
import java.util.List;

public class ThreadWork {

/*    static void newPerson() {

        PersonComparable personComparable1 = new PersonComparable(10);
        PersonComparable personComparable2 = new PersonComparable(1);
        PersonComparable personComparable3 = new PersonComparable(100);
        PersonComparable personComparable4 = new PersonComparable(56);
        PersonComparable personComparable5 = new PersonComparable(32);
        PersonComparable personComparable6 = new PersonComparable(33);

        Set<PersonComparable> set = new TreeSet<>();

        set.add(personComparable1);
        set.add(personComparable2);
        set.add(personComparable3);
        set.add(personComparable4);
        set.add(personComparable5);
        set.add(personComparable6);

        for (Object o : set)
            System.out.println(o);
    }*/

    public static void main(String[] args) {

/*        List<News> news = Arrays.asList(
                new News("Hello world", 9),
                new News("Trump is no more president", 5),
                new News("Bitcoin is greater than 30000$", 9)
        );

        Collections.sort(news);
        Arrays.sort(news.toArray());

        System.out.println(news);



        */


        MyCharThread myOwnThread0 = new MyCharThread(10, "Лукашенко");
        Thread threadRes0 = new Thread(myOwnThread0);
        threadRes0.start();

        // ____________________________________________________________________________________________

        MyCharThread myOwnThread1 = new MyCharThread(10, "Солженицын");
        Thread threadRes1 = new Thread(myOwnThread1);
        threadRes1.start();

        // ____________________________________________________________________________________________

        MyCharThread myOwnThread2 = new MyCharThread(10, "Щаранский");
        Thread threadRes2 = new Thread(myOwnThread2);
        threadRes2.start();

        // ____________________________________________________________________________________________

        MyCharThread myOwnThread3 = new MyCharThread(10, "Аксенов");
        Thread threadRes3 = new Thread(myOwnThread3);
        threadRes3.start();

        // ____________________________________________________________________________________________

        MyCharThread myOwnThread4 = new MyCharThread(10, "Столыпин");
        Thread threadRes4 = new Thread(myOwnThread4);
        threadRes4.start();

        // ____________________________________________________________________________________________

        MyCharThread myOwnThread5 = new MyCharThread(10, "Керенский");
        Thread threadRes5 = new Thread(myOwnThread5);
        threadRes5.start();

        // ____________________________________________________________________________________________


        MyCharThread myOwnThread6 = new MyCharThread(10, "Брежнев");
        Thread threadRes6 = new Thread(myOwnThread6);
        threadRes6.start();

        // ____________________________________________________________________________________________

        MyCharThread myOwnThread7 = new MyCharThread(10, "Чубайс");
        Thread threadRes7 = new Thread(myOwnThread7);
        threadRes7.start();

        // ____________________________________________________________________________________________

        MyCharThread myOwnThread8 = new MyCharThread(10, "Абрамович");
        Thread threadRes8 = new Thread(myOwnThread8);
        threadRes8.start();

        // ____________________________________________________________________________________________

        MyCharThread myOwnThread9 = new MyCharThread(10, "Березовский");
        Thread threadRes9 = new Thread(myOwnThread9);
        threadRes9.start();

        // ____________________________________________________________________________________________

        List<MyCharThread> res = MyCharThread.listOfTarakans;
        List<MyCharThread> res2 = MyCharThread.getListOfTarakans();

        System.out.println("res: " + res);
        System.out.println("res2: " + res2);

/*        Collections.sort(res);

        for (MyCharThread tarakan : res) {
            System.out.println("-> " + tarakan);
        }*/

    }

}
