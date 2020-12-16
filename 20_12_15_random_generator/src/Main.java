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


        OddTensRandomRule oddTensRandomRule = new OddTensRandomRule(300);

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
         * 2
         * 3
         * 13
         * 11
         * 24
         * 16
         * 21
         * RangeRandomRule{max=25, random=java.util.Random@682a0b20}
         *
         * -3
         * 0
         * 0
         * -3
         * -3
         * -3
         * 11
         * ListRandomRule{values=[-3, 0, 11], random=java.util.Random@4dd8dc3}
         *
         * 14
         * 14
         * 90
         * 32
         * 4
         * 22
         * 36
         * EvenRandomRule{max=100, random=java.util.Random@568db2f2}
         *
         * randomGeneratorRangeRandomRule.nextInts(n): [12, 1, 24, 10, 2, 7, 1, 2, 21, 22, 2, 23]
         * randomGeneratorListRandomRule.nextInts(n): [-3, 0, 0, 0, 0, 0, 11, 11, 11, 11, 11, 11]
         * randomGeneratorListRandomRule.nextInts(n): [56, 76, 80, 88, 66, 32, 58, 62, 52, 38, 54, 24]
         *
         * RandomGenerator{rule=RangeRandomRule{max=25, random=java.util.Random@682a0b20}}
         *
         * RandomGenerator{rule=ListRandomRule{values=[-3, 0, 11], random=java.util.Random@4dd8dc3}}
         *
         * RandomGenerator{rule=EvenRandomRule{max=100, random=java.util.Random@568db2f2}}
         */
    }
}
