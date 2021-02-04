import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Integer> intList = new ArrayList<>();

        Random r = new Random();

        int low = 1;
        int high = 99;
        int secretNumber = r.nextInt(high - low) + low;

        System.out.println("secretNumber: " + secretNumber);

        for (int i = 1; i <= 99; i++) {
            if (i == secretNumber)
                continue;

            intList.add(i);
        }

        Collections.shuffle(intList);

        System.out.println("intList: " + intList);

        // _______________________________________________________

        Set<Integer> intSetFull = new TreeSet<>(); // ordered

        for (int i = 1; i <= 100; i++) {
            intSetFull.add(i);
        }

        System.out.println("intSetFull: " + intSetFull);

        // _______________________________________________________

        Set<Integer> intSetShort = new HashSet<>(); // not ordered


        intSetFull.removeAll(intList);

        System.out.println("1: " + intSetFull);

    }

}
