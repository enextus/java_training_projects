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
    void test_count_TheNumberOfDigitsOne_2_min_0_() {
        assertEquals(0, calculateNumber.countTheNumberOfDigitsOne(2));
    }

    @Test
    void test_count_TheNumberOfDigitsOne_10_min_1_() {
        assertEquals(1, calculateNumber.countTheNumberOfDigitsOne(10));
    }

    @Test
    void test_get_NumberOfNumbers() {
    }

    @Test
    void test_calc_NumberOfNumbers() {
    }

}