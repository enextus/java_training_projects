import java.util.ArrayList;
import java.util.List;

public class Main {

    /**
     * There is a range of numbers from a to b inclusive.
     * Find the number of numbers containing the digit 1.
     */

    public static void main(String[] args) {

        int rangeMax = 30;
        int res = 0;

        for (int i = 2; i <= rangeMax; i++) {

            int count = 0;
            for (int j = 2; j <= rangeMax; j++) {
                count += findNumbers(j);
            }

            res = count;
        }

        System.out.print("Result: " + res + ", Range: [2 - " + rangeMax + "]" + " -> ");
        printRange(rangeMax);
    }

    private static void printRange(int rangeMax) {

        List<Integer> lstInt = new ArrayList<>();

        for (int i = 2; i <= rangeMax; i++) {
            lstInt.add(i);
        }

        System.out.println(lstInt);
    }

    private static int findNumbers(int n) {

        int res = 0;

        while (n > 0) {
            if (n % 10 == 2)
                res++;

            n = n / 10;
        }

        return res;
    }

}
