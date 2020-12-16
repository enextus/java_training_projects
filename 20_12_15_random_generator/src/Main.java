import generator.rule.EvenRandomRule;
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

        EvenRandomRule evenRandomRule = new EvenRandomRule(100);

        for (int i = 0; i < 7; i++)
            System.out.println(evenRandomRule.nextInt());

        System.out.println(evenRandomRule);
        System.out.println();

        // ___________________________

        RandomGenerator randomGeneratorRangeRandomRule = new RandomGenerator(rangeRandomRule);
        System.out.println("randomGeneratorRangeRandomRule.nextInts(n): " + randomGeneratorRangeRandomRule.nextInts(12));

        RandomGenerator randomGeneratorListRandomRule = new RandomGenerator(listRandomRule);
        System.out.println("randomGeneratorListRandomRule.nextInts(n): " + randomGeneratorListRandomRule.nextInts(12));

        RandomGenerator randomGeneratorEvenRandomRule = new RandomGenerator(evenRandomRule);
        System.out.println("randomGeneratorListRandomRule.nextInts(n): " + randomGeneratorEvenRandomRule.nextInts(12));

        System.out.println();
        System.out.println(randomGeneratorRangeRandomRule);

        System.out.println();
        System.out.println(randomGeneratorListRandomRule);

        System.out.println();
        System.out.println(randomGeneratorEvenRandomRule);

        /**
         * * 23
         * 6
         * 2
         * 3
         * 19
         * 5
         * 21
         * RangeRandomRule{max=25, random=java.util.Random@682a0b20}
         *
         * 0
         * 0
         * -3
         * -3
         * 0
         * 11
         * -3
         * ListRandomRule{values=[-3, 0, 11], random=java.util.Random@4dd8dc3}
         *
         * randomGeneratorRangeRandomRule.nextInts(n): [7, 5, 12, 19, 5, 6, 9, 18, 3, 12, 11, 7]
         * randomGeneratorListRandomRule.nextInts(n): [0, 0, -3, 11, -3, 0, 11, 0, -3, 0, 11, -3]
         *
         * RandomGenerator{rule=RangeRandomRule{max=25, random=java.util.Random@682a0b20}}
         *
         * RandomGenerator{rule=ListRandomRule{values=[-3, 0, 11], random=java.util.Random@4dd8dc3}}
         *
         * Process finished with exit code 0
         */
    }
}
