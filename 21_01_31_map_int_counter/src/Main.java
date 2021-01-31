import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // [1,2,4,2,3,1]-> {{1: 2}, {2: 2}, {3: 1}, {4: 1}}

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

        HashSet<Integer> keySet = lsTM.findKeys(lstInt);

        System.out.println("KeySet: " + keySet);

        for (Integer elm : keySet)
            System.out.println("elm: " + elm + ", " + Collections.frequency(lstInt, elm));


/*        elm: 1, 2
        elm: 2, 2
        elm: 3, 1
        elm: 4, 1*/
    }

}
