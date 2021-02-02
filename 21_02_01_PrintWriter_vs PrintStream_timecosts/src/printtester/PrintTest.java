package printtester;

import java.io.IOException;

public class PrintTest {

    private final IPrinter timer;

    public PrintTest(IPrinter timer) {
        this.timer = timer;
    }
    
    public void test(int times, String text) throws IOException {

        long beforeTest = System.currentTimeMillis();


        timer.print(true);


        long afterTest = System.currentTimeMillis();

        System.out.println(afterTest - beforeTest);
    }
}
