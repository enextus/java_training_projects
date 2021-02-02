import printtester.IPrinter;
import printtester.PrintWriterVsPrintStreamTimeCostsTest;
import printtester.printtester.StringBufferPrinter;
import printtester.printtester.StringBuilderPrinter;

public class Main {

    public static void main(String[] args) {

        IPrinter stringBuilderConcatenator = new StringBuilderPrinter();
        IPrinter stringBufferConcatenator = new StringBufferPrinter();

        PrintWriterVsPrintStreamTimeCostsTest test;

        //string builder test
        test = new PrintWriterVsPrintStreamTimeCostsTest(stringBuilderConcatenator);
        test.test(100000, "Santa Claus");

        //string buffer test
        test = new PrintWriterVsPrintStreamTimeCostsTest(stringBufferConcatenator);
        test.test(100000, "Santa Claus");
    }

}
