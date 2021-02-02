import printtester.IPrinter;
import printtester.PrintTest;
import printtester.printtester.PrintStreamPrinter;
import printtester.printtester.PrintWriterPrinter;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        IPrinter printWriterPrinter = new PrintWriterPrinter();
        IPrinter printStreamPrinter = new PrintStreamPrinter();

        PrintTest test;

        // printWriterPrinter test
        test = new PrintTest(printWriterPrinter);
        test.test();

        // printStreamPrinter test
        test = new PrintTest(printStreamPrinter);
        test.test();
    }

}

/*      10381
        9021

        Process finished with exit code 0*/

