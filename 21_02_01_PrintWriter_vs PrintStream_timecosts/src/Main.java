import concatenator.IConcatenator;
import concatenator.ConcatenationTest;
import concatenator.concatenator.StringBufferConcatenator;
import concatenator.concatenator.StringBuilderConcatenator;

public class Main {

    public static void main(String[] args) {

        IConcatenator stringBuilderConcatenator = new StringBuilderConcatenator();
        IConcatenator stringBufferConcatenator = new StringBufferConcatenator();

        ConcatenationTest test;

        //string builder test
        test = new ConcatenationTest(stringBuilderConcatenator);
        test.test(100000, "Santa Claus");

        //string buffer test
        test = new ConcatenationTest(stringBufferConcatenator);
        test.test(100000, "Santa Claus");
    }

}
