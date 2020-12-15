import generator.rule.ListRandomRule;
import generator.rule.RangeRandomRule;

public class Main {

    public static void main(String[] args) {

        RangeRandomRule rangeRandomRule = new RangeRandomRule(25);

        System.out.println(rangeRandomRule.nextInt());
        System.out.println();

        System.out.println(rangeRandomRule.hashCode());
        System.out.println();

        System.out.println(rangeRandomRule);
        System.out.println();

        ListRandomRule listRandomRule = new ListRandomRule(new int[]{-3, 0, 11});

        System.out.println(listRandomRule.nextInt());
        System.out.println(listRandomRule.nextInt());
        System.out.println(listRandomRule.nextInt());
        System.out.println(listRandomRule.nextInt());
        System.out.println(listRandomRule.nextInt());

        /**
         * 18
         *
         * 468121027
         *
         * RangeRandomRule{max=25, random=java.util.Random@6ce253f1}
         *
         * 11
         * -3
         * -3
         * 11
         * -3
         *
         * Process finished with exit code 0
         */
    }
}
