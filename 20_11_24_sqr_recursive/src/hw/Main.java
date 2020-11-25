package hw;

public class Main {
    public static void main(String[] args) {
        GcdSolver gcdSolver = new GcdSolver();

        System.out.println(gcdSolver.getGcd(214748364, 666));
        System.out.println(gcdSolver.getGcd(214748364, 237));
    }
}
