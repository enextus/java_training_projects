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

    private List<Integer> convertIntToList(int[] ints) {

        List<Integer> intList = new ArrayList<>(ints.length);

        for (int i : ints)
            intList.add(i);

        return intList;
    }

    @Override
    public int nextInt() {
        return values.get(random.nextInt(values.size()));
    }
}
