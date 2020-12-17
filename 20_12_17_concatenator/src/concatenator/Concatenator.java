package concatenator;

import java.util.ArrayList;
import java.util.List;

/**
 * polymorphism
 */
public class Concatenator {

    private Concatenator rule;

    public RandomGenerator(RandomRule rule) {
        this.rule = rule;
    }

    public List<Integer> nextInts(int n) {
        List<Integer> res = new ArrayList<>(n);

        for (int j = 1; j <= n; j++)
            res.add(rule.nextInt());

        return res;
    }
}
