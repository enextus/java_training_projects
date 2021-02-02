import printtester.IPrinter;
import printtester.PrintTest;
import printtester.printtester.PrintStreamPrinter;
import printtester.printtester.PrintWriterPrinter;

import java.io.IOException;
import java.io.PrintWriter;

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
