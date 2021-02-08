import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class ThreadWork {

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

        int count = 10;

        MyCharThread[] threads = new MyCharThread[count];
        List<MyCharThread> masterList = new Vector<>();

        for (int i = 0; i < count; i++) {
            threads[i] = new MyCharThread(masterList, "00" + (i + 1));
            threads[i].start();
        }

        while (isOperationRunning(threads)) {
            // do nothing
        }

        System.out.println("Done!! Print Your Tarakan - List:");

        Collections.sort(masterList);

        for (MyCharThread item : masterList) {
            System.out.println("["
                    + item.getNickname() + ": "
                    + item.getWholeTimeForAllTimes() + " ms."
                    + "]");
        }

        MyCharThread temp = masterList.get(0);

        System.out.println();
        System.out.println("Tarakan: " + temp.nickname + " won wit the time: " + temp.getWholeTimeForAllTimes());
    }

}

/*

Done!! Print Your Tarakan - List:
[009: 711 ms.]
[003: 717 ms.]
[001: 727 ms.]
[0010: 738 ms.]
[007: 747 ms.]
[008: 766 ms.]
[005: 769 ms.]
[002: 777 ms.]
[004: 793 ms.]
[006: 824 ms.]

Tarakan: 009 won wit the time: 711

*/
