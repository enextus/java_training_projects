package generator.rule;

import generator.RandomRule;

import java.util.Random;

/**
 * implementation of the interface named "EvenRandomRule". The Random numbers in the range are even.
 */
public class EvenRandomRule implements RandomRule {

    private int max;
    private Random random;

    public EvenRandomRule(int max) {
        this.max = max;
        this.random = new Random();
    }

    @Override
    public int nextInt() {

        while (true) {
            int nextInt = random.nextInt(max);
            if ((nextInt % 2) == 0)
                return nextInt;
        }
    }

    @Override
    public String toString() {
        return "EvenRandomRule{" +
                "max=" + max +
                ", random=" + random +
                '}';
    }
}
