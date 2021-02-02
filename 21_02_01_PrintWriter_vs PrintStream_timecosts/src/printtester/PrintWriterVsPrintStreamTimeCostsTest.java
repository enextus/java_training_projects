package printtester;

import java.util.Arrays;

public class PrintWriterVsPrintStreamTimeCostsTest {

    private final IPrinter timer;

    public PrintWriterVsPrintStreamTimeCostsTest(IPrinter timer) {
        this.timer = timer;
    }
    
    public void test(int times, String text) {

        String[] arrayToConcatenate = composeArray(times, text);

        long beforeTest = System.currentTimeMillis();


        timer.concatenate(arrayToConcatenate);


        long afterTest = System.currentTimeMillis();

        System.out.println(afterTest - beforeTest);
    }

    String[] composeArray(int times, String text) {

        String[] strings = new String[times];
        Arrays.fill(strings, text);

        return strings;
    }
    
}
