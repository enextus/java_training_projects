import java.util.ArrayList;
import java.util.List;

public class Main_dev {

    /**
     * There is a range of numbers from a to b inclusive.
     * Find the number of numbers containing the digit 1.
     */

    public static void main(String[] args) {

        int leftRangeCorner = 0;
        int rightRangeCorner = 3000;

        leftRangeCorner = 0;
        rightRangeCorner = 3000;


        int result = 0;

        for (int i = leftRangeCorner; i <= rightRangeCorner; i++) {

            int count = 0;
            for (int j = 2; j <= rightRangeCorner; j++) {
                count += findTheNumberOfDigitsOne(j);
            }

            result = count;
        }

        System.out.print("Result: " + result + ", Range: [2 - " + rightRangeCorner + "]" + " -> ");
        printRange(rightRangeCorner);
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

    private static void printRange(int rangeMax) {

        List<Integer> lstInt = new ArrayList<>();

        for (int i = 2; i <= rangeMax; i++) {
            lstInt.add(i);
        }

        System.out.println(lstInt);
    }

}
