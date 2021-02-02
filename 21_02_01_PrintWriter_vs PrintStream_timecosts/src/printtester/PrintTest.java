package printtester;

import java.io.IOException;

public class PrintTest {

    private final IPrinter iPrinter;

    public PrintTest(IPrinter iPrinter) {
        this.iPrinter = iPrinter;
    }
    
    public void test(int times, String text) throws IOException {

        long beforeTest = System.currentTimeMillis();


        iPrinter.print(true);


        long afterTest = System.currentTimeMillis();

        System.out.println(afterTest - beforeTest);
    }
}
