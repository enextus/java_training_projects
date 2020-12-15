package generator;

import java.util.ArrayList;
import java.util.List;

/**
 * polymorphism general
 */
public class RandomGenerator {

    private RandomRule rule;

    public RandomGenerator(RandomRule rule) {
        this.rule = rule;
    }

    public List<Integer> nextInts(int n) {
        List<Integer> intList = new ArrayList<>(n);

        for (int j = 0; j < n; j++) {
            intList.add(j);
            System.out.println("j: " + j);
        }

        return intList;
    }
}
