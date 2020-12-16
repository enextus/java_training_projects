package generator.rule;

import generator.RandomRule;

import java.util.Random;

/**
 *
 *  implementation of the interface named "RangeRandomRule"
 *
 */
public class RangeRandomRule implements RandomRule {

    private int max;
    private Random random;

    public RangeRandomRule(int max) {
        this.max = max;
        this.random = new Random();
    }

    @Override
    public int nextInt() {
        return random.nextInt(max);
    }

    @Override
    public String toString() {
        return "RangeRandomRule{" +
                "max=" + max +
                ", random=" + random +
                '}';
    }
}
