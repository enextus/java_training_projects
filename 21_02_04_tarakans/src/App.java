import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {

    public static void main(String[] args) {

        int count = 10;

        MyTarakanThread[] threads = new MyTarakanThread[count];
        List<MyTarakanThread> masterList = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            threads[i] = new MyTarakanThread(masterList, "00" + (i + 1));
            threads[i].start();
        }

        while (isOperationRunning(threads)) {
            // do nothing
        }

        System.out.println("Done!! Print Your Tarakan - List:");

        Collections.sort(masterList);

        for (MyTarakanThread item : masterList) {
            System.out.println("["
                    + item.getNickname() + ": "
                    + item.getWholeTimeForAllTimes() + " ms."
                    + "]");
        }

        MyTarakanThread temp = masterList.get(0);

        System.out.println();
        System.out.println("Tarakan: " + temp.nickname + " won wit the time: " + temp.getWholeTimeForAllTimes());
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
[004: 661 ms.]
[007: 683 ms.]
[0010: 728 ms.]
[009: 729 ms.]
[003: 743 ms.]
[002: 754 ms.]
[001: 780 ms.]
[006: 782 ms.]
[008: 803 ms.]
[005: 809 ms.]

Tarakan: 004 won wit the time: 661

*/
