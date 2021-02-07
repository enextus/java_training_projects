import java.util.List;
import java.util.Vector;

public class ThreadWork {

    public static void main(String[] args) {

        int count = 10;
        Thread[] threads = new ListThread[count];
        List<String> masterList = new Vector<String>();

        for (int index = 0; index < count; index++) {
            threads[index] = new ListThread(masterList, "Thread " + (index + 1));
            threads[index].start();
        }
        while (isOperationRunning(threads)) {
            // do nothing
        }

        System.out.println("Done!! Print Your List ...");

        for (String item : masterList) {
            System.out.println("[" + item + "]");
        }
    }

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
}
