import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        FindTheLostNumber findTheLostNumber = new FindTheLostNumber();

        List<Integer> intList = findTheLostNumber.generateTheList();

        System.out.println("IntList: " + intList);

        // _______________________________________________________

        Set<Integer> intSetFull = findTheLostNumber.generateAHundredNumbers();

        System.out.println("IntSetFull: " + intSetFull);

        // _______________________________________________________

       Integer res = findTheLostNumber.findTheLostNumber(intSetFull, intList);

        System.out.println("The secret number was found: " + res);
    }

}
