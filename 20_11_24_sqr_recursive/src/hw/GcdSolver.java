package hw;

/**
 * class GcdSolver
 * getGcd(m,n) (greatest common divisor)
 */
public class GcdSolver {

    /**
     * The method accepts only positive int numbers.
     *
     * @param a int number
     * @param b int number
     * @return GCD of a and b
     */
    public int getGcd(int a, int b) {
        return b == 0 ? a : getGcd(b, a % b);
    }
}