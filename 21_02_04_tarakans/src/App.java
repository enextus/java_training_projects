import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {

    public static void main(String[] args) {

        int count = 10;

        MyTarakanThread[] threads = new MyTarakanThread[count];
        List<MyTarakanThread> tarakanList = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            threads[i] = new MyTarakanThread(tarakanList, "00" + (i + 1));
            threads[i].start();
        }

        while (isOperationRunning(threads)) {
            // do nothing
        }

        System.out.println("Done!! Print Your Tarakan - List:");

        Collections.sort(tarakanList);

        for (MyTarakanThread item : tarakanList) {
            System.out.println("["
                    + item.getNickname() + ": "
                    + item.getWholeTimeForAllTimes() + " ms."
                    + "]");
        }

        MyTarakanThread temp = tarakanList.get(0);

        System.out.println();
        System.out.println("Tarakan: "
                + temp.getNickname() + " won wit the time: "
                + temp.getWholeTimeForAllTimes());
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

/*

Done!! Print Your Tarakan - List:
[003: 705 ms.]
[005: 723 ms.]
[007: 726 ms.]
[008: 745 ms.]
[006: 754 ms.]
[001: 765 ms.]
[009: 774 ms.]
[0010: 789 ms.]
[002: 811 ms.]
[004: 814 ms.]

Tarakan: 003 won wit the time: 705

*/
