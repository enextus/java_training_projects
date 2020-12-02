import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringToCodeTest {

    @Test
    void test_aaabbcdddd_a3b2cd4() {
        StringToCode stringToCode = new StringToCode("aaabbcdddd");
        assertEquals("a3b2cd4", stringToCode.stringCoding());
    }
}