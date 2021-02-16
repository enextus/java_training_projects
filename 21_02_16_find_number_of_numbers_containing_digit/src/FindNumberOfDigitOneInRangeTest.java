import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindNumberOfDigitOneInRangeTest {

    FindNumberOfDigitOneInRange calculateNumber = new FindNumberOfDigitOneInRange();

    @Test
    void test_count_TheNumberOfDigitsOne_0_0_() {
        assertEquals(0, calculateNumber.countTheNumberOfDigitsOne(0));
    }

    @Test
    void test_count_TheNumberOfDigitsOne_1_1_() {
        assertEquals(1, calculateNumber.countTheNumberOfDigitsOne(1));
    }

    @Test
    void test_count_TheNumberOfDigitsOne_2_0_() {
        assertEquals(0, calculateNumber.countTheNumberOfDigitsOne(2));
    }

    @Test
    void test_count_TheNumberOfDigitsOne_10_1_() {
        assertEquals(1, calculateNumber.countTheNumberOfDigitsOne(10));
    }

    @Test
    void test_count_TheNumberOfDigitsOne_11_2_() {
        assertEquals(2, calculateNumber.countTheNumberOfDigitsOne(11));
    }

    @Test
    void test_count_TheNumberOfDigitsOne_111_3_() {
        assertEquals(3, calculateNumber.countTheNumberOfDigitsOne(111));
    }

    @Test
    void test_count_TheNumberOfDigitsOne_101010_3_() {
        assertEquals(3, calculateNumber.countTheNumberOfDigitsOne(101010));
    }

    @Test
    void test_count_TheNumberOfDigitsOne_123414321_3_() {
        assertEquals(3, calculateNumber.countTheNumberOfDigitsOne(123414321));
    }

    @Test
    void test_calc_NumberOfNumbers___() {
        assertEquals(0, calculateNumber.calcNumberOfNumbers(0, 0));
    }

}