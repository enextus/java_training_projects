import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringToCodeTest {

    @Test
    void stringCoding() {
        StringToCode stringToCode = new StringToCode("aaabbcdddd");
        assertEquals("a3b2cd4", stringToCode.stringCoding());
    }
}