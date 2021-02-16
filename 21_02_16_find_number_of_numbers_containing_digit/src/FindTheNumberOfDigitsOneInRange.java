import java.util.ArrayList;
import java.util.List;

public class FindTheNumberOfDigitsOneInRange {

    private final int leftRangeCorner;
    private final int rightRangeCorner;

    public FindTheNumberOfDigitsOneInRange(int leftRangeCorner, int rightRangeCorner) {
        this.leftRangeCorner = leftRangeCorner;
        this.rightRangeCorner = rightRangeCorner;
    }

    private int getLeftRangeCorner() {
        return leftRangeCorner;
    }

    private int getRightRangeCorner() {
        return rightRangeCorner;
    }

    public int calculateNumberOfNumbers() {

        int result;
        result = 0;

        for (int i = getLeftRangeCorner(); i <= getRightRangeCorner(); i++) {

            int count = 0;
            for (int j = getLeftRangeCorner(); j <= getRightRangeCorner(); j++) {
                count += findTheNumberOfDigitsOne(j);
            }

            result = count;
        }

        System.out.print("Result: " + result + ", Range: [" + getLeftRangeCorner() + " - " + getRightRangeCorner() + "]" + " -> ");
        printRange(rightRangeCorner);

        return result;
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

    private void printRange(int rangeMax) {

        List<Integer> lstInt = new ArrayList<>();

        for (int i = 2; i <= rangeMax; i++) {
            lstInt.add(i);
        }

        System.out.println(lstInt);
    }

}
