import concatenator.IConcatenator;
import concatenator.PrintWriterVsPrintStreamTimeCostsTest;
import concatenator.concatenator.StringBufferConcatenator;
import concatenator.concatenator.StringBuilderConcatenator;

public class Main {

    public static void main(String[] args) {

        IConcatenator stringBuilderConcatenator = new StringBuilderConcatenator();
        IConcatenator stringBufferConcatenator = new StringBufferConcatenator();

        PrintWriterVsPrintStreamTimeCostsTest test;

        //string builder test
        test = new PrintWriterVsPrintStreamTimeCostsTest(stringBuilderConcatenator);
        test.test(100000, "Santa Claus");

        //string buffer test
        test = new PrintWriterVsPrintStreamTimeCostsTest(stringBufferConcatenator);
        test.test(100000, "Santa Claus");
    }

}
