import java.util.ArrayList;
import java.util.List;

public class FindTheNumberOfDigitsOneInRange {

    int leftRangeCorner;
    int rightRangeCorner;

    public FindTheNumberOfDigitsOneInRange(int leftRangeCorner, int rightRangeCorner) {
        this.leftRangeCorner = leftRangeCorner;
        this.rightRangeCorner = rightRangeCorner;
    }

    public int getLeftRangeCorner() {
        return leftRangeCorner;
    }

    public int getRightRangeCorner() {
        return rightRangeCorner;
    }

    public int calculateNumberOfNumbers() {

        int result = 0;

        for (int i = getLeftRangeCorner(); i <= getRightRangeCorner(); i++) {

            int count = 0;
            for (int j = 2; j <= getRightRangeCorner(); j++) {
                count += findTheNumberOfDigitsOne(j);
            }

            result = count;
        }

/*        System.out.print("Result: " + result + ", Range: [2 - " + rightRangeCorner + "]" + " -> ");
        printRange(rightRangeCorner);*/

        return result;
    }


    private int findTheNumberOfDigitsOne(int n) {

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
