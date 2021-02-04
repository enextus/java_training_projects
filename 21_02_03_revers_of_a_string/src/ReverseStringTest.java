import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseStringTest {

    private final ReverseString strReverser = new ReverseString();

    @Test
    void test_reverseString_abc_vs_cba() {
        assertEquals("cba", strReverser.reverseString("abc"));
    }

    @Test
    void test_reverseString_a_b_c_vs_c_b_a() {
        assertEquals("c b a", strReverser.reverseString("a b c"));
    }

    @Test
    void test_reverseString_A_b_C_vs_C_b_A() {
        assertEquals("C b A", strReverser.reverseString("A b C"));
    }
}