import generator.rule.ListRandomRule;
import generator.rule.RangeRandomRule;
import generator.RandomGenerator;

public class Main {

    public static void main(String[] args) {

        RangeRandomRule rangeRandomRule = new RangeRandomRule(25);

        for (int i = 0; i < 7; i++)
            System.out.println(rangeRandomRule.nextInt());

        System.out.println(rangeRandomRule);
        System.out.println();

        // ___________________________

        ListRandomRule listRandomRule = new ListRandomRule(new int[]{-3, 0, 11});

        for (int i = 0; i < 7; i++)
            System.out.println(listRandomRule.nextInt());

        System.out.println(listRandomRule);
        System.out.println();

        // ___________________________

        RandomGenerator randomGeneratorRangeRandomRule = new RandomGenerator(rangeRandomRule);
        System.out.println("randomGeneratorRangeRandomRule.nextInts(n): " + randomGeneratorRangeRandomRule.nextInts(12));

        RandomGenerator randomGeneratorListRandomRule = new RandomGenerator(listRandomRule);
        System.out.println("randomGeneratorListRandomRule.nextInts(n): " + randomGeneratorListRandomRule.nextInts(12));

        System.out.println();
        System.out.println(randomGeneratorRangeRandomRule);
        System.out.println();
        System.out.println(randomGeneratorListRandomRule);

        /**
         * 17
         * 13
         * 18
         * 4
         * 24
         * 19
         * 14
         * RangeRandomRule{max=25, random=java.util.Random@682a0b20}
         *
         * 0
         * 0
         * -3
         * 11
         * 0
         * 0
         * 0
         * ListRandomRule{values=[-3, 0, 11], random=java.util.Random@4dd8dc3}
         *
         * randomGeneratorRangeRandomRule.nextInts(n): [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
         * randomGeneratorListRandomRule.nextInts(n): [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
         *
         * Process finished with exit code 0
         */
    }
}
