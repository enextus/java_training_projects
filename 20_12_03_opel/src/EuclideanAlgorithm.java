public class EuclideanAlgorithm {

    public static void main(String[] args) {

        int a = 1071;
        int b = 462;

        System.out.println("GCD = " + getGcd(a, b));
        System.out.println();
    }

    private static int getGcd(int a, int b) {
        int gcd;
        gcd = Math.max(a, b);

        do {
            gcd--;
        } while (a % gcd != 0 || b % gcd != 0);
        return gcd;
    }
}
