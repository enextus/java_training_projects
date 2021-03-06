package hw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GcdSolverTest {

    GcdSolver gcdSolver = new GcdSolver();

    @Test
    public void testGcd_nEquals15_20_5() {
        assertEquals(5, gcdSolver.getGcd(15, 20));
    }

    @Test
    public void testGcd_nEquals20_15_5() {
        assertEquals(5, gcdSolver.getGcd(20, 15));
    }

    @Test
    public void test_nEquals1071_462_21() {
        assertEquals(21, gcdSolver.getGcd(1071, 462));
    }

    @Test
    public void test_nEquals462_1071_21() {
        assertEquals(21, gcdSolver.getGcd(462, 1071));
    }

    @Test
    public void test_nEquals100045_1071_21() {
        assertEquals(17, gcdSolver.getGcd(100045, 1071));
    }

    @Test
    public void test_nEquals214748364_666_6() {
        assertEquals(6, gcdSolver.getGcd(214748364, 666));
    }
}