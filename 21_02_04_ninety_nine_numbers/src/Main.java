import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        FindTheLostNumber findTheLostNumber = new FindTheLostNumber();
        Integer lostNumber = findTheLostNumber.getLostNUmber();

        System.out.println("LostNumber: " + lostNumber);

        // _______________________________________________________
        List<Integer> intList = findTheLostNumber.generateTheList();

        System.out.println("IntList: " + intList);

        // _______________________________________________________

        Set<Integer> intSetFull = findTheLostNumber.generateAHundredNumbers();

        System.out.println("IntSetFull: " + intSetFull);

        // _______________________________________________________

        Integer res = findTheLostNumber.findTheLostNumber(intSetFull, intList);

        System.out.println("The lost number was found: " + res);
    }

}
