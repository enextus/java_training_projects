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
    }
}
