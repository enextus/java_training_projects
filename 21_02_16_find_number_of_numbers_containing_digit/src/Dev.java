import java.util.ArrayList;
import java.util.List;

public class Dev {

    /**
     * There is a range of numbers from a to b inclusive.
     * Find the number of numbers containing the digit 1.
     */

    public static void main(String[] args) {

        int leftRangeCorner;
        int rightRangeCorner;

        leftRangeCorner = -5;
        rightRangeCorner = 11;


        if (leftRangeCorner < 0) {

            List<Integer> negativePart = new ArrayList<>();

            for (int i = 1; i <= Math.abs(leftRangeCorner); i++) {
                negativePart.add(i);
            }

            System.out.println(negativePart);

            leftRangeCorner = 0;
        }


        int result = 0;

        for (int i = leftRangeCorner; i <= rightRangeCorner; i++) {

            int count = 0;
            for (int j = leftRangeCorner; j <= rightRangeCorner; j++) {
                count += findTheNumberOfDigitsOne(j);
            }

            result = count;
        }

        System.out.print("Result: " + result + ", Range: [" + leftRangeCorner + " - " + rightRangeCorner + "]" + " -> ");
        printRange(leftRangeCorner, rightRangeCorner);
    }

    private static int findTheNumberOfDigitsOne(int n) {

        int count = 0;

        while (n > 0) {

            if (n % 10 == 1)
                count++;

            n = n / 10;
        }

        return count;
    }

    private static void printRange(int leftRangeCorner, int rightRangeCorner) {

        List<Integer> lstInt = new ArrayList<>();

        for (int i = leftRangeCorner; i <= rightRangeCorner; i++) {
            lstInt.add(i);
        }

        System.out.println(lstInt);
    }

    /*    void printVisual() {

        this.setResult(calcNumberOfNumbers(getLeftRangeCorner(), getRightRangeCorner()));

        System.out.print("Result: " + getResult()
                + ", Range: [" + getLeftRangeCorner()
                + " - " + getRightRangeCorner()
                + "] -> ");

        printRange(getRightRangeCorner());
    }
    }*/
}
