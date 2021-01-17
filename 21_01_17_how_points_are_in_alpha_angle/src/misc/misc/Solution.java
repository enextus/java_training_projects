package misc.misc;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int coveredPoints(List<Integer> integerList, int leftCorner, int rightCorner) {

        int points = 0;
        int maxPoints = 0;
        int cut = rightCorner - leftCorner;

        // get(i) -> ArrayList O(1)
        ArrayList<Integer> numbers = new ArrayList<>(integerList);

        for (int i = 0; i < numbers.size(); i++) {
            for (int j = i; j < numbers.size(); j++) {


                System.out.println("(i): " + numbers.get(i) + ", (j): " + numbers.get(j));
                System.out.println("(j) - (i): " + (numbers.get(j) - numbers.get(i)) + ", cut = " + cut);
                System.out.println();


                if (numbers.get(j) - numbers.get(i) <= cut)
                    points++;
            }

            if (points >= maxPoints) {
                maxPoints = points;
                System.out.println("******************************           Points: " + points);
            }

            points = 0;
        }

        return maxPoints;
    }
}
