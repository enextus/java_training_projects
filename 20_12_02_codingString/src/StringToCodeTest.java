import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringToCodeTest {

    @Test
    public void test_givenWhenInstanceIsCorrect_thenReturnTrue() {

        String alphabet = "";

        for (char character = 'a'; character <= 'z'; character++) {
            alphabet += character;

            if (alphabet.length() <= 1)
                continue;

            StringToCode stringToCode = new StringToCode(alphabet);
            assertEquals(alphabet, stringToCode.stringCoding());
        }

        StringToCode stringToCode = new StringToCode("abcdefghijklmnopqrstuvwxyz");
        assertTrue(stringToCode instanceof StringToCode);

    }

    @Test
    void test_Input_aa_Result_a2() {
        StringToCode stringToCode = new StringToCode("aa");
        assertEquals("a2", stringToCode.stringCoding());
    }

    @Test
    void test_Input_ab_Result_ab() {
        StringToCode stringToCode = new StringToCode("ab");
        assertEquals("ab", stringToCode.stringCoding());
    }

    @Test
    void test_Input_aaa_Result_a3() {
        StringToCode stringToCode = new StringToCode("aaa");
        assertEquals("a3", stringToCode.stringCoding());
    }

    @Test
    void test_Input_abb_Result_ab2() {
        StringToCode stringToCode = new StringToCode("abb");
        assertEquals("ab2", stringToCode.stringCoding());
    }

    @Test
    void test_Input_abc_Result_abc() {
        StringToCode stringToCode = new StringToCode("abc");
        assertEquals("abc", stringToCode.stringCoding());
    }

    @Test
    void test_Input_abbbc_Result_ab3c() {
        StringToCode stringToCode = new StringToCode("abbbc");
        assertEquals("ab3c", stringToCode.stringCoding());
    }

    @Test
    void test_Input_abbcca_Result_ab2c2a() {
        StringToCode stringToCode = new StringToCode("abbcca");
        assertEquals("ab2c2a", stringToCode.stringCoding());
    }

    @Test
    void test_Input_aaabbcdddd_Result_a3b2cd4() {
        StringToCode stringToCode = new StringToCode("aaabbcdddd");
        assertEquals("a3b2cd4", stringToCode.stringCoding());
    }
}