import concatenator.IConcatenator;
import concatenator.ConcatenationTest;
import concatenator.concatenator.StringBufferConcatenator;
import concatenator.concatenator.StringBuilderConcatenator;
import concatenator.concatenator.StringConcatenator;

public class Main {

    public static void main(String[] args) {

        IConcatenator stringConcatenator = new StringConcatenator();
        IConcatenator stringBuilderConcatenator = new StringBuilderConcatenator();
        IConcatenator stringBufferConcatenator = new StringBufferConcatenator();

        ConcatenationTest test;

        //string test
        test = new ConcatenationTest(stringConcatenator);
        test.test(100000, "Santa Claus");

        //string builder test
        test = new ConcatenationTest(stringBuilderConcatenator);
        test.test(100000, "Santa Claus");

        //string buffer test
        test = new ConcatenationTest(stringBufferConcatenator);
        test.test(100000, "Santa Claus");

        // time test
//        String res = "";
//        long beforeConcatenation = System.currentTimeMillis();
//        for (int i = 0; i < 10000; i++) {
//            res += "Evgeny Borisovich";
//        }
//        long timeConcatenated = System.currentTimeMillis() - beforeConcatenation;
//        System.out.println(timeConcatenated);
//
//        List<String> strings = new ArrayList<>();
//        strings.toArray();


        // StringBuilder

//        StringBuilder builder = new StringBuilder();
//        builder.append("Evgeny")
//                .append(" ")
//                .append("Borisovich");
//
//        builder.append("Evgeny");
//        builder.append(" ");
//        builder.append("Borisovich");
//
//        String str = builder.toString();
//        System.out.println(str);
    }

}
