import java.util.List;
import java.util.Vector;

public class ThreadWork {

    // https://stackoverflow.com/questions/31367744/multiple-threads-in-a-thread-pool-writing-data-in-same-list

    private static boolean isOperationRunning(Thread[] threads) {
        boolean running = false;

        for (Thread thread : threads) {
            if (thread.isAlive()) {
                running = true;
                break;
            }
        }
        return running;
    }

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

        int count = 10;
        MyCharThread[] threads = new MyCharThread[count];
        List<MyCharThread> masterList = new Vector<MyCharThread>();

        for (int index = 0; index < count; index++) {
            threads[index] = new MyCharThread(masterList, "Thread " + (index + 1));
            threads[index].start();
        }
        while (isOperationRunning(threads)) {
            // do nothing
        }

        System.out.println("Done!! Print Your List ...");
        System.out.println(masterList);
        for (MyCharThread item : masterList) {
            System.out.println("[" + item + "]");
        }

/*
        MyCharThread myOwnThread0 = new MyCharThread(10, "Лукашенко");
        Thread threadRes0 = new Thread(myOwnThread0);
        threadRes0.start();

        // ____________________________________________________________________________________________

        List<MyCharThread> res = MyCharThread.listOfTarakans;
        List<MyCharThread> res2 = MyCharThread.getListOfTarakans();*/


/*        Collections.sort(res);

        for (MyCharThread tarakan : res) {
            System.out.println("-> " + tarakan);
        }*/

    }

}
