public class Main {

    /**
     * There is a range of numbers from a to b inclusive.
     * Find the number of numbers containing the digit 1.
     */
    public static void main(String[] args) {

        int rangeMax = 23; // 2, 12, 20, 22

        int count = 0;
        for (int i = 2; i <= rangeMax; i++) { // beginning with 2
            count += numberOf2s(i);
        }

        System.out.println("Result: " + count);

    }

    private static int numberOf2s(int n) {
        int count = 0;
        while (n > 0) {
            if (n % 10 == 2) {
                count++;
            }
            n = n / 10;
        }
        return count;
    }





}
