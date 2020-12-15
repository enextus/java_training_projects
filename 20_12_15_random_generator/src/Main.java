import generator.rule.ListRandomRule;
import generator.rule.RangeRandomRule;
import generator.RandomGenerator;
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

        RandomGenerator randomGenerator = new RandomGenerator(rangeRandomRule);
        System.out.println("randomGenerator.nextInts(n): " + randomGenerator.nextInts(12));

        RandomGenerator randomGenerator2 = new RandomGenerator(listRandomRule);
        System.out.println("randomGenerator.nextInts(n): " + randomGenerator2.nextInts(12));

        /**
         * /home/enextus/.jdks/openjdk-14.0.2/bin/java -javaagent:/snap/intellij-idea-ultimate/263/lib/idea_rt.jar=35401:/snap/intellij-idea-ultimate/263/bin -Dfile.encoding=UTF-8 -classpath /home/enextus/IdeaProjects/java_training_projects/20_12_15_random_generator/out/production/20_12_15_random_generator Main
         * 7
         *
         * 468121027
         *
         * RangeRandomRule{max=25, random=java.util.Random@6ce253f1}
         *
         * -3
         * -3
         * 0
         * 11
         * 0
         * randomGenerator.nextInts(n): [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
         * randomGenerator.nextInts(n): [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
         *
         * Process finished with exit code 0
         */
    }
}
