import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*

Done!! Print Your Tarakan - List:
[005:  time: 664 ms.]
[007:  time: 706 ms.]
[003:  time: 707 ms.]
[001:  time: 723 ms.]
[009:  time: 742 ms.]
[0010:  time: 765 ms.]
[002:  time: 784 ms.]
[004:  time: 805 ms.]
[006:  time: 827 ms.]
[008:  time: 836 ms.]

Tarakan: 005 won wit the time: 664
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
                + " won wit the time: " + temp.getWholeTimeForAllTimes()
        );
    }

}

