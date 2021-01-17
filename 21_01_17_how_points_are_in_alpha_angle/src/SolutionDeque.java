import java.util.*;

import java.util.ArrayList;
import java.util.List;

public class SolutionDeque {

    public int coveredPoints(List<Integer> integerList, int leftCorner, int rightCorner) {

        int maxPoints = 0;
        int cut = rightCorner - leftCorner;

        // get(i) -> ArrayList O(1)
        ArrayList<Integer> numbers = new ArrayList<>(integerList);

        ArrayDeque<Integer> maximusDeque = new ArrayDeque<Integer>();

        for (int i = 0; i < numbers.size(); i++) {
            for (int j = i; j < numbers.size(); j++) {

/*                System.out.println("(i): " + numbers.get(i) + ", (j): " + numbers.get(j));
                System.out.println("(j) - (i): " + (numbers.get(j) - numbers.get(i)) + ", cut = " + cut);
                System.out.println();*/

                if (numbers.get(j) - numbers.get(i) <= cut) {

                    if (maximusDeque.isEmpty()) {
                        maximusDeque.addLast(1);
                    } else {
                        int val = maximusDeque.getLast() + 1;

                        System.out.println("val " + val);
                        maximusDeque.addLast(val);
                        System.out.println("maximusDeque.size(): " + maximusDeque.size());
                    }

                }
            }



            if (maximusDeque.size() >= maxPoints) {
                maxPoints = maximusDeque.size();
                System.out.println("maximusDeque.size(): " + maximusDeque.size());
            }

            maximusDeque.clear();
        }

        return maxPoints;
    }
}
