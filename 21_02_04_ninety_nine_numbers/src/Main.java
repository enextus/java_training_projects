import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Integer> intList = new ArrayList<>();

        Random rnd = new Random();

        int low = 1;
        int high = 100;
        int secretNumber = rnd.nextInt(high - low) + low;

        System.out.println("SecretNumber: " + secretNumber);

        for (int i = 1; i <= 100; i++) {
            if (i == secretNumber)
                continue;

            intList.add(i);
        }

        Collections.shuffle(intList);

        System.out.println("IntList: " + intList);

        // _______________________________________________________

        Set<Integer> intSetFull = new TreeSet<>(); // ordered

        for (int i = 1; i <= 100; i++) {
            intSetFull.add(i);
        }

        System.out.println("IntSetFull: " + intSetFull);

        // _______________________________________________________

        intSetFull.removeAll(intList);

        System.out.println("The secret number was found: " + intSetFull.iterator().next());
    }

}
