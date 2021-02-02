package timetester;

import java.util.Arrays;

public class PrintWriterVsPrintStreamTimeCostsTest {

    private final ITimer timer;

    public PrintWriterVsPrintStreamTimeCostsTest(ITimer timer) {
        this.timer = timer;
    }
    
    public void test(int i, String text) {

        String[] arrayToConcatenate = composeArray(i, text);

        long beforeTest = System.currentTimeMillis();
        timer.concatenate(arrayToConcatenate);
        long afterTest = System.currentTimeMillis();

        System.out.println(afterTest - beforeTest);
    }

    String[] composeArray(int i, String text) {

        String[] strings = new String[i];
        Arrays.fill(strings, text);

        return strings;
    }
    
}
