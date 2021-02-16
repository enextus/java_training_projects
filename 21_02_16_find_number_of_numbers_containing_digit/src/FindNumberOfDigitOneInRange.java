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
            int res2;

            this.setLeftRangeCorner(0);
            this.setRightRangeCorner(rightCorner);

            this.setResult(calculateNumberOfNumbers(getLeftRangeCorner(), Math.abs(temp1)));


            res2 = this.calculateNumberOfNumbers(getLeftRangeCorner(), getRightRangeCorner());

            this.setResult(getResult() + res2);

            System.out.println("here: " + getResult());

        } else {

            // this.setResult(calculateNumberOfNumbers(getLeftRangeCorner(), Math.abs(temp1)));

        }

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
