public class Main {

    /**
     * There is a range of numbers from a to b inclusive.
     * Find the number of numbers containing the digit 1.
     */
    public static void main(String[] args) {

        int rangeMax = 20; // 2, 12, 20, 22

        for (int k = 2; k <= rangeMax; k++) {

            int count = 0;
            for (int i = 2; i <= rangeMax; i++) { // beginning with 2
                count += findNumbers(i);
            }

            System.out.print("Result: " + count + ", Range: ");
            printRange(k);
        }

    }

    private static void printRange(int k) {
        for (int j = 2; j <= k; j++) {
            System.out.print("" + j + ", ");
        }
        System.out.println("");
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
