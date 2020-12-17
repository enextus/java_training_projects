package concatenator;

import java.util.ArrayList;

/**
 * polymorphism
 */
public class ConcatenatorTest {

    private final IConcatenator concatenator;
    

    public ConcatenatorTest(IConcatenator concatenator) {
        this.concatenator = concatenator;
    }


    public void test(int times, String text) {

        String[] arrayToConcatenate = composeArray(times, text);

        long beforeTest = System.currentTimeMillis();

        concatenator.concatenate(arrayToConcatenate);

        long afterTest = System.currentTimeMillis();

    }

    private String[] composeArray(int times, String text){



        for (int i = 0; i < times; i++) {
            composedArray
            concatenator.concatenate();
        }

        return composedArray;
    }
}
