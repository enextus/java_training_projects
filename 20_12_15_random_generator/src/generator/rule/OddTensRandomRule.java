package generator.rule;

import generator.RandomRule;

import java.util.Random;

/**
 * implementation of the interface named "OddTensRandomRule". The Random numbers in the range are odd.
 */
public class OddTensRandomRule implements RandomRule {

    private int max;
    private Random random;

    public OddTensRandomRule(int max) {
        this.max = max;
        this.random = new Random();
    }

    @Override
    public int nextInt() {

        while (true) {
            int nextInt = random.nextInt(max);
            if ((nextInt % 2) != 0)
                return nextInt;
        }
    }

    @Override
    public String toString() {
        return "OddTensRandomRule{" +
                "max=" + max +
                ", random=" + random +
                '}';
    }
}