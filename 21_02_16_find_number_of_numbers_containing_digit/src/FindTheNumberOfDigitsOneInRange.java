import java.util.ArrayList;
import java.util.List;

public class FindTheNumberOfDigitsOneInRange {

    private final int leftRangeCorner;
    private final int rightRangeCorner;
    private int result;

    public FindTheNumberOfDigitsOneInRange(int leftRangeCorner, int rightRangeCorner) {
        this.leftRangeCorner = leftRangeCorner;
        this.rightRangeCorner = rightRangeCorner;
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

    void printVisual() {



        System.out.print("Result: "
                + getResult()
                + ", Range: ["
                + getLeftRangeCorner()
                + " - " + getRightRangeCorner()
                + "]"
                + " -> ");
        printRange(getRightRangeCorner());
    }

    private void printRange(int rangeMax) {

        List<Integer> lstInt = new ArrayList<>();

        for (int i = leftRangeCorner; i <= rightRangeCorner; i++) {
            lstInt.add(i);
        }

        System.out.println(lstInt);
    }

}
