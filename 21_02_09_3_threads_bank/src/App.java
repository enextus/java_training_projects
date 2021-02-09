import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {

    public static void main(String[] args) throws InterruptedException {

        int count = 10;

        BankThread[] threadTrack = new BankThread[count];
        List<BankThread> listParticipants = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            threadTrack[i] = new BankThread(listParticipants, "00" + (i + 1));
            threadTrack[i].start();
        }

        for (int i = 0; i < count; i++) {
            threadTrack[i].join();
        }

        System.out.println("Done!! Print Your Tarakan - List:");

        Collections.sort(listParticipants);
        BankThread temp = listParticipants.get(0);

        for (BankThread item : listParticipants) {
            System.out.println("[" + item.getnickname() + ": "
                    + " time: " + item.getWholeTimeForAllTimes() + " ms."
                    + "]");
        }

        System.out.println();
        System.out.println(
                "Tarakan: " + temp.getnickname()
                + " won wit the time: " + temp.getWholeTimeForAllTimes()
        );
    }

}
