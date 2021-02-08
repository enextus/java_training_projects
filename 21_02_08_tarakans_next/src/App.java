import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/*

Done!! Print Your Tarakan - List:
[003:  WholeTimeForAllRealTime: -> 5461 ms.; ---> 5461 whole time as given: 674 ms.]
[004:  WholeTimeForAllRealTime: -> 4080 ms.; ---> 4080 whole time as given: 685 ms.]
[006:  WholeTimeForAllRealTime: -> 4183 ms.; ---> 4183 whole time as given: 699 ms.]
[001:  WholeTimeForAllRealTime: -> 5835 ms.; ---> 5835 whole time as given: 714 ms.]
[0010:  WholeTimeForAllRealTime: -> 5627 ms.; ---> 5627 whole time as given: 736 ms.]
[005:  WholeTimeForAllRealTime: -> 6809 ms.; ---> 6809 whole time as given: 774 ms.]
[002:  WholeTimeForAllRealTime: -> 5887 ms.; ---> 5887 whole time as given: 775 ms.]
[008:  WholeTimeForAllRealTime: -> 4836 ms.; ---> 4836 whole time as given: 784 ms.]
[009:  WholeTimeForAllRealTime: -> 5151 ms.; ---> 5151 whole time as given: 796 ms.]
[007:  WholeTimeForAllRealTime: -> 4366 ms.; ---> 4366 whole time as given: 895 ms.]

Tarakan: 003 won wit the time: 5461 | -> common number: 3 | -> class creation real time: 1612807342255 | -> instance creation time: 1612807342269 | -> whole real time: 5461

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
                    + " WholeTimeForAllRealTime: -> " + +item.getWholeTimeForAllRealTimes() + " ms.; ---> "
                    + new Date(item.getWholeTimeForAllRealTimes()).getTime()
                    + " whole time as given: " + item.getWholeTimeForAllTimes() + " ms."
                    + "]");
        }

        System.out.println();
        System.out.println(
                "Tarakan: " + temp.getNickname()
                + " won wit the time: " + temp.getWholeTimeForAllRealTimes()
                + " | -> common number: " + temp.getCommonNumber()
                + " | -> class creation real time: " + temp.getClassCreationTime()
                + " | -> instance creation time: " + temp.getInstanceCreationTime()
                + " | -> whole real time: " + temp.getWholeTimeForAllRealTimes()
        );
    }

}

