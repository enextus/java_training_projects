import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int maxCoveredPoints(List<Integer> integerList, int leftCorner, int rightCorner) {

        int points = 0;
        int maxPoints = 0;

        // get(i) -> ArrayList O(1)
        ArrayList<Integer> numbers = new ArrayList<>(integerList);

        for (int i = 0; i < numbers.size(); i++) {
            for (int j = i; j < numbers.size(); j++) {

                System.out.println("numbers.get(j): " + numbers.get(j) + ", numbers.get(i): " + numbers.get(i) + ", numbers.get(j) - numbers.get(i): " + (numbers.get(j) - numbers.get(i)));

                if ((numbers.get(j) - numbers.get(i) >= leftCorner) && (numbers.get(j) - numbers.get(i) <= rightCorner))
                    points++;
            }

            if (points >= maxPoints)
                maxPoints = points;

            points = 0;
        }

        return maxPoints;
    }
}
