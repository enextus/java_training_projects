import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> lstInt = new ArrayList<>();

        lstInt.add(1);
        lstInt.add(2);
        lstInt.add(4);
        lstInt.add(2);
        lstInt.add(3);
        lstInt.add(1);

        System.out.println("Our Integer list:");

        for (Integer elm : lstInt)
            System.out.println(elm);

        System.out.println("\n");
        System.out.println("_____________________________________________________________");

        ListToMap lsTM = new ListToMap();

        HashSet<String> keySet = lsTM.findKeys(lstInt);

        System.out.println("KeySet: " + keySet);
    }

}
