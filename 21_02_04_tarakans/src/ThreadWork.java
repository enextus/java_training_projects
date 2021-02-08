import java.util.Collections;
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

/*
        Collections.sort(news);
        Arrays.sort(news.toArray());
        System.out.println(news);
        */

        int count = 10;
        MyCharThread[] threads = new MyCharThread[count];
        List<MyCharThread> masterList = new Vector<>();

        for (int index = 0; index < count; index++) {
            threads[index] = new MyCharThread(masterList, "Thread " + (index + 1));
            threads[index].start();
        }
        while (isOperationRunning(threads)) {
            // do nothing
        }

        System.out.println("Done!! Print Your Tarakan - List:");

        Collections.sort(masterList);

        for (MyCharThread item : masterList) {
            System.out.println("[" + item.getNickname() + ": " + item.getWholeTimeForAllTimes() + " ms." + "]");
        }

    }

}
/*

Done!! Print Your Tarakan - List:
        [Thread 3: 626 ms.]
        [Thread 9: 673 ms.]
        [Thread 10: 698 ms.]
        [Thread 6: 719 ms.]
        [Thread 5: 721 ms.]
        [Thread 7: 739 ms.]
        [Thread 2: 770 ms.]
        [Thread 4: 772 ms.]
        [Thread 8: 780 ms.]
        [Thread 1: 785 ms.]

        Process finished with exit code 0

*/
