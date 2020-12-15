package generator;

import java.util.ArrayList;
import java.util.List;

public class RandomGenerator {

    private RandomRule rule;

    public RandomGenerator(RandomRule rule) {
        this.rule = rule;
    }

    public List<Integer> nextInts(int n) {
        List<Integer> intList = new ArrayList<>(n);

        for (int i : intList)
            intList.add(i);

        return intList;
    }
}
