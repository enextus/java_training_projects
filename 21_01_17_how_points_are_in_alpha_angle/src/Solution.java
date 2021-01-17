import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int coveredPoints(List<Integer> integerList, int leftCorner, int rightCorner) {

        int points = 0;
        int maxPoints = 0;

        // get(i) -> ArrayList O(1)
        ArrayList<Integer> numbers = new ArrayList<>(integerList);

        for (int i = 0; i < numbers.size(); i++) {
            for (int j = i; j < numbers.size(); j++) {

                System.out.println("(i): " + numbers.get(i) + ", (j): " + numbers.get(j));
                System.out.println("(j) - (i): " + (numbers.get(j) - numbers.get(i)));
                System.out.println();

                if ((numbers.get(j) >= leftCorner) && (numbers.get(j) - numbers.get(i) <= rightCorner))
                    points++;
            }

            if (points >= maxPoints)
                maxPoints = points;

            points = 0;
        }

        return maxPoints;
    }
}
