package generator.rule;

import generator.RandomRule;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * implementation of the interface named "ListRandomRule"
 */
public class ListRandomRule implements RandomRule {

    private List<Integer> values;
    private Random random;

    public ListRandomRule(List<Integer> numbers) {
        this.values = new ArrayList<>(numbers);
        this.random = new Random();
    }

    public ListRandomRule(int[] numbers) {
        this.values = convertIntToList(numbers);
        this.random = new Random();
    }

    @Override
    public int nextInt() {
        return values.get(random.nextInt(values.size()));
    }

    private List<Integer> convertIntToList(int[] ints) {
        List<Integer> res = new ArrayList<>(ints.length);

        for (int i : ints)
            res.add(i);

        return res;
    }

    @Override
    public String toString() {
        return "ListRandomRule{" +
                "values=" + values +
                ", random=" + random +
                '}';
    }
}
