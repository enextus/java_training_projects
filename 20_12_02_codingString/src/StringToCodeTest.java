import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringToCodeTest {

    @Test
    void test_Coded_String_a_Result_a() {
        StringToCode stringToCode = new StringToCode("aa");
        assertEquals("a2", stringToCode.stringCoding());
    }

    @Test
    void test_Coded_String_aaabbcdddd_Result_a3b2cd4() {
        StringToCode stringToCode = new StringToCode("aaabbcdddd");
        assertEquals("a3b2cd4", stringToCode.stringCoding());
    }
}