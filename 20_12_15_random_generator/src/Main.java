import generator.rule.EvenRandomRule;
import generator.rule.ListRandomRule;
import generator.rule.OddTensRandomRule;
import generator.rule.RangeRandomRule;
import generator.RandomGenerator;

public class Main {
    /**
     * Get the current line number.
     *
     * @return int - Current line number.
     */
    public static int getLineNumber() {
        return Thread.currentThread().getStackTrace()[2].getLineNumber();
    }
    public static void main(String[] args) {

        RangeRandomRule rangeRandomRule = new RangeRandomRule(25);

        for (int i = 0; i < 4; i++)
            System.out.println(rangeRandomRule.nextInt());

        System.out.println(rangeRandomRule);
        System.out.println();

        // ___________________________

        ListRandomRule listRandomRule = new ListRandomRule(new int[]{-3, 0, 11});

        for (int i = 0; i < 4; i++)
            System.out.println(listRandomRule.nextInt());

        System.out.println(listRandomRule);
        System.out.println();

        // ___________________________

        EvenRandomRule evenRandomRule = new EvenRandomRule(100);

        for (int i = 0; i < 4; i++)
            System.out.println(evenRandomRule.nextInt());

        System.out.println(evenRandomRule);
        System.out.println();

        // ___________________________


        OddTensRandomRule oddTensRandomRule = new OddTensRandomRule(900);

        for (int i = 0; i < 4; i++)
            System.out.println(oddTensRandomRule.nextInt());

        System.out.println(getLineNumber());
        System.out.println(oddTensRandomRule);
        System.out.println();

        // ___________________________

        RandomGenerator randomGeneratorRangeRandomRule = new RandomGenerator(rangeRandomRule);
        System.out.println("randomGeneratorRangeRandomRule.nextInts(n): " + randomGeneratorRangeRandomRule.nextInts(12));

        RandomGenerator randomGeneratorListRandomRule = new RandomGenerator(listRandomRule);
        System.out.println("randomGeneratorListRandomRule.nextInts(n): " + randomGeneratorListRandomRule.nextInts(12));

        RandomGenerator randomGeneratorEvenRandomRule = new RandomGenerator(evenRandomRule);
        System.out.println("randomGeneratorListRandomRule.nextInts(n): " + randomGeneratorEvenRandomRule.nextInts(12));

        RandomGenerator randomGeneratorOddTensRandomRule = new RandomGenerator(oddTensRandomRule);
        System.out.println("randomGeneratorOddTensRandomRule.nextInts(n): " + randomGeneratorOddTensRandomRule.nextInts(12));

        System.out.println();
        System.out.println(randomGeneratorRangeRandomRule);

        System.out.println();
        System.out.println(randomGeneratorListRandomRule);

        System.out.println();
        System.out.println(randomGeneratorEvenRandomRule);

        System.out.println();
        System.out.println(randomGeneratorOddTensRandomRule);
        /**
         * 18
         * 16
         * 1
         * 24
         * RangeRandomRule{max=25, random=java.util.Random@682a0b20}
         *
         * 0
         * -3
         * 11
         * 11
         * ListRandomRule{values=[-3, 0, 11], random=java.util.Random@4dd8dc3}
         *
         * 46
         * 28
         * 0
         * 2
         * EvenRandomRule{max=100, random=java.util.Random@568db2f2}
         *
         * 115
         * 221
         * 217
         * 229
         * 54
         * OddTensRandomRule{max=300, random=java.util.Random@2d98a335}
         *
         * randomGeneratorRangeRandomRule.nextInts(n): [12, 11, 3, 16, 9, 0, 6, 9, 14, 20, 17, 22]
         * randomGeneratorListRandomRule.nextInts(n): [11, 11, 0, 11, 0, 11, -3, 11, 11, 0, -3, 11]
         * randomGeneratorListRandomRule.nextInts(n): [90, 44, 0, 52, 4, 66, 88, 48, 26, 12, 96, 72]
         * randomGeneratorOddTensRandomRule.nextInts(n): [145, 119, 17, 227, 199, 99, 3, 29, 123, 179, 105, 281]
         *
         * RandomGenerator{rule=RangeRandomRule{max=25, random=java.util.Random@682a0b20}}
         *
         * RandomGenerator{rule=ListRandomRule{values=[-3, 0, 11], random=java.util.Random@4dd8dc3}}
         *
         * RandomGenerator{rule=EvenRandomRule{max=100, random=java.util.Random@568db2f2}}
         *
         * RandomGenerator{rule=OddTensRandomRule{max=300, random=java.util.Random@2d98a335}}
         *
         * Process finished with exit code 0
         */
    }
}
