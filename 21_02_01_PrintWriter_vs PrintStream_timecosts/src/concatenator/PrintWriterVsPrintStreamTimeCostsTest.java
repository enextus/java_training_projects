package concatenator;

import java.util.Arrays;

public class PrintWriterVsPrintStreamTimeCostsTest {

    private final ITimer concatenator;

    public PrintWriterVsPrintStreamTimeCostsTest(ITimer concatenator) {
        this.concatenator = concatenator;
    }
    
    public void test(int i, String text) {

        String[] arrayToConcatenate = composeArray(i, text);

        long beforeTest = System.currentTimeMillis();
        concatenator.concatenate(arrayToConcatenate);
        long afterTest = System.currentTimeMillis();

        System.out.println(afterTest - beforeTest);
    }

    String[] composeArray(int i, String text) {

        String[] strings = new String[i];
        Arrays.fill(strings, text);

        return strings;
    }
    
}
