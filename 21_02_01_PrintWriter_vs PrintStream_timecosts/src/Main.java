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

        //string printWriterPrinter test
        test = new PrintTest(printWriterPrinter);
        test.test();

        //string printStreamPrinter test
        test = new PrintTest(printStreamPrinter);
        test.test();
    }

}

/*      1986
        1569
        Process finished with exit code 0*/

