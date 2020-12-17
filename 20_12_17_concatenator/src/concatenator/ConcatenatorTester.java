package concatenator;

import java.util.ArrayList;
import java.util.List;

/**
 * polymorphism
 */
public class ConcatenatorTester {

    private IConcatenator rule;

    public ConcatenatorTester(IConcatenator rule) {
        this.rule = rule;
    }

    public List<Integer> nextInts(int n) {
        List<Integer> res = new ArrayList<>(n);

        for (int j = 1; j <= n; j++)
            res.add(rule.concatenate());

        return res;
    }
}
