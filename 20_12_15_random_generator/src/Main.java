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
         * /home/enextus/.jdks/openjdk-14.0.2/bin/java -javaagent:/snap/intellij-idea-ultimate/263/lib/idea_rt.jar=38657:/snap/intellij-idea-ultimate/263/bin -Dfile.encoding=UTF-8 -classpath /home/enextus/IdeaProjects/java_training_projects/20_12_15_random_generator/out/production/20_12_15_random_generator:/home/enextus/IdeaProjects/java_training_projects/20_12_15_random_generator/lib/junit-jupiter-5.4.2.jar:/home/enextus/IdeaProjects/java_training_projects/20_12_15_random_generator/lib/junit-jupiter-api-5.4.2.jar:/home/enextus/IdeaProjects/java_training_projects/20_12_15_random_generator/lib/apiguardian-api-1.0.0.jar:/home/enextus/IdeaProjects/java_training_projects/20_12_15_random_generator/lib/opentest4j-1.1.1.jar:/home/enextus/IdeaProjects/java_training_projects/20_12_15_random_generator/lib/junit-platform-commons-1.4.2.jar:/home/enextus/IdeaProjects/java_training_projects/20_12_15_random_generator/lib/junit-jupiter-params-5.4.2.jar:/home/enextus/IdeaProjects/java_training_projects/20_12_15_random_generator/lib/junit-jupiter-engine-5.4.2.jar:/home/enextus/IdeaProjects/java_training_projects/20_12_15_random_generator/lib/junit-platform-engine-1.4.2.jar Main
         * 23
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
