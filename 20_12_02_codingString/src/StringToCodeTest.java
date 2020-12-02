import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringToCodeTest {

    @Test
    void test_Coded_String_aa_Result_a2() {
        StringToCode stringToCode = new StringToCode("aa");
        assertEquals("a2", stringToCode.stringCoding());
    }

    @Test
    void test_Coded_String_ab_Result_ab() {
        StringToCode stringToCode = new StringToCode("vvbcc");
        assertEquals("v2bc2", stringToCode.stringCoding());
    }

    @Test
    void test_Coded_String_aaabbcdddd_Result_a3b2cd4() {
        StringToCode stringToCode = new StringToCode("aaabbcdddd");
        assertEquals("a3b2cd4", stringToCode.stringCoding());
    }
}