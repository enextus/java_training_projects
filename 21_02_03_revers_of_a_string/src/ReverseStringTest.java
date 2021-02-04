import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseStringTest {

    private final ReverseString strReverser = new ReverseString();

    @Test
    void test_reverseString_abc_cba() {
        assertEquals("cba", strReverser.reverseString("abc"));
    }
}