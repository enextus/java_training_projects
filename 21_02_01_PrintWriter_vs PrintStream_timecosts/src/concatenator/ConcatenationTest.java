package concatenator;

import java.util.Arrays;

public class ConcatenationTest {

    private final IConcatenator concatenator;

    public ConcatenationTest(IConcatenator concatenator) {
        this.concatenator = concatenator;
    }

    String[] composeArray(int times, String text) {

        String[] strings = new String[times];

        Arrays.fill(strings, text);

        return strings;
    }

    public void test(int numberOfAttempts, String text) {

        String[] arrayToConcatenate = composeArray(numberOfAttempts, text);

        long beforeTest = System.currentTimeMillis();
        concatenator.concatenate(arrayToConcatenate);

        long afterTest = System.currentTimeMillis();

        System.out.println(afterTest - beforeTest);
    }

}
