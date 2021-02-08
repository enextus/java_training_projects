import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*

Done!! Print Your Tarakan - List:
        [006:  time: 659 ms.]
    [008:  time: 707 ms.]
    [003:  time: 717 ms.]
    [005:  time: 720 ms.]
    [007:  time: 736 ms.]
    [004:  time: 739 ms.]
    [0010:  time: 753 ms.]
    [009:  time: 767 ms.]
    [002:  time: 769 ms.]
    [001:  time: 780 ms.]

Tarakan: 006 won wit the time: 4974 | -> whole real time: 4974
 */
public class App {

    public static void main(String[] args) throws InterruptedException {

        int count = 10;

        MyTarakanThread[] threadTrack = new MyTarakanThread[count];
        List<MyTarakanThread> listParticipants = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            threadTrack[i] = new MyTarakanThread(listParticipants, "00" + (i + 1));
            threadTrack[i].start();
        }

        for (int i = 0; i < count; i++) {
            threadTrack[i].join();
        }

        System.out.println("Done!! Print Your Tarakan - List:");

        Collections.sort(listParticipants);
        MyTarakanThread temp = listParticipants.get(0);

        for (MyTarakanThread item : listParticipants) {
            System.out.println("[" + item.getNickname() + ": "
                    + " time: " + item.getWholeTimeForAllTimes() + " ms."
                    + "]");
        }

        System.out.println();
        System.out.println(
                "Tarakan: " + temp.getNickname()
                + " won wit the time: " + temp.getWholeTimeForAllRealTimes()
                + " | -> whole real time: " + temp.getWholeTimeForAllRealTimes()
        );
    }

}

