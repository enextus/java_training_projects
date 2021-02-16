import java.util.ArrayList;
import java.util.List;

public class FindNumberOfDigitOneInRange {

    private int leftRangeCorner;
    private int rightRangeCorner;
    private int result;

    public FindNumberOfDigitOneInRange() {
        this.leftRangeCorner = 0;
        this.rightRangeCorner = 0;
    }

    public void setLeftRangeCorner(int leftRangeCorner) {
        this.leftRangeCorner = leftRangeCorner;
    }

    public void setRightRangeCorner(int rightRangeCorner) {
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

    public void setResult(int result) {
        this.result = result;
    }


    public int startNumberOfNumbers(int leftCorner, int rightCorner) {

        if (leftCorner < 0) {

            int temp1 = leftCorner;
            int temp2 = rightCorner;
            int negativeRes;

            this.setLeftRangeCorner(0);
            this.setRightRangeCorner(rightCorner);
            this.setResult(calculateNumberOfNumbers(getLeftRangeCorner(), Math.abs(temp1)));

            negativeRes = this.calculateNumberOfNumbers(getLeftRangeCorner(), getRightRangeCorner());

            this.setResult(getResult() + negativeRes);

        } else
            this.setResult(calculateNumberOfNumbers(leftCorner, rightCorner));

        return getResult();
    }


    public int calculateNumberOfNumbers(int leftCorner, int rightCorner) {


        int count = 0;

        for (int j = leftCorner; j <= rightCorner; j++) {
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

        this.setResult(calculateNumberOfNumbers(getLeftRangeCorner(), getRightRangeCorner()));

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
