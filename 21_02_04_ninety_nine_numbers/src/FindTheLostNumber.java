import java.util.*;

public class FindTheLostNumber {

    List<Integer> generateTheList() {

        List<Integer> intList = new ArrayList<>();
        Random rnd = new Random();
        int low = 1;
        int high = 100;
        int secretNumber = rnd.nextInt(high - low) + low;

        for (int i = 1; i <= 100; i++) {
            if (i == secretNumber)
                continue;

            intList.add(i);
        }

        Collections.shuffle(intList);

        return intList;
    }

    Set<Integer> generateAHundredNumbers() {

        Set<Integer> intSetFull = new TreeSet<>(); // ordered

        for (int i = 1; i <= 100; i++) {
            intSetFull.add(i);
        }

        return intSetFull;
    }


}
