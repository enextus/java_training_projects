import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
