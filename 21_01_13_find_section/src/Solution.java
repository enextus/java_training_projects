import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public int maxCoveredPoints(List<Integer> integerList, int cut) {
        int points = 0;
        int maxPoints = 0;

        ArrayList<Integer> numbers = new ArrayList<>(integerList);

        for (int i = 0; i < numbers.size(); i++) {
            for (int j = i ; j < numbers.size(); j++) {

                if (numbers.get(j) - numbers.get(i) <= cut) {
                    points++;
                }
            }

            if (points >= maxPoints)
                maxPoints = points;

            points = 0;
        }

        return maxPoints;
    }
}
