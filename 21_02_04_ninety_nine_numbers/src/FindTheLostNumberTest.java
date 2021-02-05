import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindTheLostNumberTest {

    private final FindTheLostNumber findTheLostNumber = new FindTheLostNumber();

    @Test
    void test_generateTheList_size() {
        assertEquals(99, findTheLostNumber.generateTheList().size());
    }

    @Test
    void test_generateAHundredNumbers_size() {
        assertEquals(100, findTheLostNumber.generateAHundredNumbers().size());
    }

    @Test
    void test_findTheLostNumber_value() {

        Integer expected = findTheLostNumber.getLostNUmber();

        assertEquals(expected, findTheLostNumber.generateAHundredNumbers().size());
    }
}
