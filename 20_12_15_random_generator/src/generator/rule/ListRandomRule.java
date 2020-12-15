package generator.rule;

import generator.RandomRule;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListRandomRule implements RandomRule {

    private List<Integer> values;
    private Random random;

    public ListRandomRule(List<Integer> numbers) {
        this.values = numbers;
        this.random = new Random();
    }

    public ListRandomRule(int[] numbers) {
        this.values = convertIntToList(numbers);
        this.random = new Random();
    }

    private List<Integer> convertIntToList(int[] ints) {

        List<Integer> intList = new ArrayList<Integer>(ints.length);

        for (int i : ints)
            intList.add(i);

        return intList;
    }

    @Override
    public int nextInt() {

        System.out.println("values.size(): " + values.size());
        System.out.println("random.nextInt(values.size()): " + random.nextInt(values.size()));

        return values.get(random.nextInt(values.size()));
    }
}
