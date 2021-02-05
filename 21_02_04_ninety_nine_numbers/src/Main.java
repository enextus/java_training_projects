import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        FindTheLostNumber findTheLostNumber = new FindTheLostNumber();

        List<Integer> intList = findTheLostNumber.generateTheList();

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
