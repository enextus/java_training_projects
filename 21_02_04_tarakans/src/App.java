import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {

    public static void main(String[] args) {

        int count = 10;

        MyTarakanThread[] threadTrack = new MyTarakanThread[count];
        List<MyTarakanThread> listParticipants = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            threadTrack[i] = new MyTarakanThread(listParticipants, "00" + (i + 1));
            threadTrack[i].start();
        }

        while (isOperationRunning(threadTrack)) {

            // do nothing
        }

        System.out.println("Done!! Print Your Tarakan - List:");

        Collections.sort(listParticipants);
        MyTarakanThread temp = listParticipants.get(0);

        for (MyTarakanThread item : listParticipants) {
            System.out.println("["
                    + item.getNickname() + ": "
                    + item.getWholeTimeForAllTimes() + " ms."
                    + " Created: "
                    +  item.getWholeTimeForAllRealTimes() + " "
                    + "]");
        }

        System.out.println();
        System.out.println("Tarakan: "
                + temp.getNickname() + " won wit the time: "
                + temp.getWholeTimeForAllRealTimes() + " | -> common number: "
                + temp.getCommonNumber() + " | -> class creation real time: "
                + temp.getClassCreationTime() +
                " | -> instance creation time: "
                + temp.getInstanceCreationTime() + " | -> whole real time: "
                + temp.getWholeTimeForAllRealTimes()

        );
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
[007: 663 ms.]
[003: 666 ms.]
[006: 703 ms.]
[002: 718 ms.]
[008: 722 ms.]
[005: 760 ms.]
[004: 767 ms.]
[009: 783 ms.]
[0010: 787 ms.]
[001: 796 ms.]

Tarakan: 007 won wit the time: 663

*/
