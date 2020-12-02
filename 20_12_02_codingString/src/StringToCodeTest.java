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
        StringToCode stringToCode = new StringToCode("ab");
        assertEquals("ab", stringToCode.stringCoding());
    }

    @Test
    void test_Coded_String_aaa_Result_a3() {
        StringToCode stringToCode = new StringToCode("aaa");
        assertEquals("a3", stringToCode.stringCoding());
    }

    @Test
    void test_Coded_String_abb_Result_ab2() {
        StringToCode stringToCode = new StringToCode("abb");
        assertEquals("ab2", stringToCode.stringCoding());
    }

    @Test
    void test_Coded_String_aaabbcdddd_Result_a3b2cd4() {
        StringToCode stringToCode = new StringToCode("aaabbcdddd");
        assertEquals("a3b2cd4", stringToCode.stringCoding());
    }
}