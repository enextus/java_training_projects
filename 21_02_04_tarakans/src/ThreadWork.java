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

        for (MyCharThread item : masterList) {
            System.out.println("[" + item.getNickname() + ": " + item.getWholeTimeForAllTimes() + "]");
        }

    }

}
