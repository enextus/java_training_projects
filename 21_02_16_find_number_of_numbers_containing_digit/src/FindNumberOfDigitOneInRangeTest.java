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
    void test_calc_NumberOfNumbers_0_0__0() {
        assertEquals(0, calculateNumber.calcNumberOfNumbers(0, 0));
    }

    @Test
    void test_calc_NumberOfNumbers_0_1__1() {
        assertEquals(1, calculateNumber.calcNumberOfNumbers(0, 1));
    }

    @Test
    void test_calc_NumberOfNumbers_0_11__3() {
        assertEquals(4, calculateNumber.calcNumberOfNumbers(0, 11));
    }

    @Test
    void test_calc_NumberOfNumbers_0_111__3() {
        assertEquals(36, calculateNumber.calcNumberOfNumbers(0, 111));
    }

    @Test
    void test_getNumberOfNumbers_0_0__0() {
        assertEquals(0, calculateNumber.findNumberOfNumbers(0, 0));
    }

    @Test
    void test_getNumberOfNumbers_0_1__1() {
        assertEquals(1, calculateNumber.findNumberOfNumbers(0, 1));
    }

    @Test
    void test_getNumberOfNumbers_min1_0__1() {
        assertEquals(1, calculateNumber.findNumberOfNumbers(-1, 0));
    }

    @Test
    void test_getNumberOfNumbers_min1_1__2() {
        assertEquals(2, calculateNumber.findNumberOfNumbers(-1, 1));
    }

    @Test
    void test_getNumberOfNumbers_min11_1__2() {
        assertEquals(5, calculateNumber.findNumberOfNumbers(-11, 1));
    }

    @Test
    void test_getNumberOfNumbers_min11_11__2() {
        assertEquals(8, calculateNumber.findNumberOfNumbers(-11, 11));
    }

}
