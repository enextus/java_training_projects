public class Main {

    /**
     * There is a range of numbers from a to b inclusive.
     * Find the number of numbers containing the digit 1.
     */
    public static void main(String[] args) {

        // for (int j = 0; j < k; j++) { System.out.print(k + ", "); }


        int rangeMax = 14; // 2, 12, 20, 22

        for (int k = 0; k < 30; k++) {

            int count = k;
            for (int i = 2; i <= rangeMax; i++) { // beginning with 2
                count += findNumbers(i);
            }

            System.out.println(" --- Result: " + count + "RangeMax: "   );
            printRange(k);
        }

    }

    private static void printRange(int k) {
        for (int j = 0; j < k; j++) { System.out.print(k + ", "); }
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
