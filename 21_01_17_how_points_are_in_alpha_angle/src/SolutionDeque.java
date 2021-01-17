import java.util.*;

import java.util.ArrayList;
import java.util.List;

public class SolutionDeque {
    public int coveredPoints(List<Integer> integerList, int rightCorner) {

        int maxPoints = 0;
        int cut = rightCorner;

        ArrayList<Integer> numbers = new ArrayList<>(integerList);        // get(i) -> ArrayList O(1)
        ArrayDeque<Integer> maximusDeque = new ArrayDeque<Integer>();

        for (int i = 0; i < numbers.size(); i++) {

            for (int j = i; j < numbers.size(); j++) {
                if (numbers.get(j) - numbers.get(i) <= cut) {

                    if (maximusDeque.isEmpty())
                        maximusDeque.addLast(1);
                    else
                        maximusDeque.addLast(maximusDeque.getLast() + 1);

                }
            }

            int size = maximusDeque.size();
            if (size >= maxPoints)
                maxPoints = size;

            maximusDeque.clear();
        }

        return maxPoints;
    }


}
