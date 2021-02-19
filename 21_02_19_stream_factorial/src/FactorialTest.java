import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FactorialTest {

    Factorial<Integer> factorial = new Factorial();

    @Test
    void test_calcFact_1_1() {
        assertEquals(1, factorial.calcFact(1));
    }

    @Test
    void test_calcFact_5_120() {
        assertEquals(120, factorial.calcFact(5));
    }

    @Test
    void test_calcFact_100_() {
        assertEquals(3628800, factorial.calcFact(10));
    }
}