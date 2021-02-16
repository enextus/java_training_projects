import java.util.ArrayList;
import java.util.List;

public class FindNumberOfDigitOneInRange {

    private int leftRangeCorner;
    private final int rightRangeCorner;
    private int result;

    public FindNumberOfDigitOneInRange(int leftRangeCorner, int rightRangeCorner) {
        this.leftRangeCorner = leftRangeCorner;
        this.rightRangeCorner = rightRangeCorner;
    }

    public void setLeftRangeCorner(int leftRangeCorner) {
        this.leftRangeCorner = leftRangeCorner;
    }

    public int getResult() {
        return result;
    }

    private int getLeftRangeCorner() {
        return leftRangeCorner;
    }

    private int getRightRangeCorner() {
        return rightRangeCorner;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public int calculateNumberOfNumbers() {

        int count = 0;

        for (int j = getLeftRangeCorner(); j <= getRightRangeCorner(); j++) {
            count += findTheNumberOfDigitsOne(j);
        }

        return count;
    }

    int findTheNumberOfDigitsOne(int n) {

        int count = 0;

        while (n > 0) {

            if (n % 10 == 1)
                count++;

            n = n / 10;
        }

        return count;
    }

    void printVisual() {

        this.setResult(calculateNumberOfNumbers());

        System.out.print("Result: " + getResult()
                + ", Range: [" + getLeftRangeCorner()
                + " - " + getRightRangeCorner()
                + "] -> ");

        printRange(getRightRangeCorner());
    }

    private void printRange(int rangeMax) {

        List<Integer> lstInt = new ArrayList<>();

        for (int i = getLeftRangeCorner(); i <= getRightRangeCorner(); i++) {
            lstInt.add(i);
        }

        System.out.println(lstInt);
    }

}
