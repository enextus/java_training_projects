package generator.rule;

import generator.RandomRule;

import java.util.List;
import java.util.Random;

public class ListRandomRule implements RandomRule {

    private List<Integer> values;
    private Random random;

    public ListRandomRule(int max) {
        this.max = max;
        this.random = new Random();
    }


    @Override
    public int nextInt() {
        return random.nextInt();
    }
}
