import printtester.IPrinter;
import printtester.PrintTest;
import printtester.printtester.StringBufferPrinter;
import printtester.printtester.StringBuilderPrinter;

public class Main {

    public static void main(String[] args) {

        IPrinter stringBuilderConcatenator = new StringBuilderPrinter();
        IPrinter stringBufferConcatenator = new StringBufferPrinter();

        PrintTest test;

        //string builder test
        test = new PrintTest(stringBuilderConcatenator);
        test.test(100000, "Santa Claus");

        //string buffer test
        test = new PrintTest(stringBufferConcatenator);
        test.test(100000, "Santa Claus");
    }

}
