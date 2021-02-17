import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindNumberOfDigitOneInRangeTest {

    FindNumberOfDigitOneInRange calculateNumber = new FindNumberOfDigitOneInRange();

    @Test
    void test_calcDigitsOne_0_0_() {
        assertEquals(0, calculateNumber.calcDigitsOne(0));
    }

    @Test
    void test_calcDigitsOne_1_1_() {
        assertEquals(1, calculateNumber.calcDigitsOne(1));
    }

    @Test
    void test_calcDigitsOne_2_0_() {
        assertEquals(0, calculateNumber.calcDigitsOne(2));
    }

    @Test
    void test_calcDigitsOne_10_1_() {
        assertEquals(1, calculateNumber.calcDigitsOne(10));
    }

    @Test
    void test_calcDigitsOne_11_2_() {
        assertEquals(2, calculateNumber.calcDigitsOne(11));
    }

    @Test
    void test_count_calcDigitsOne_111_3_() {
        assertEquals(3, calculateNumber.calcDigitsOne(111));
    }

    @Test
    void test_count_calcDigitsOne_101010_3_() {
        assertEquals(3, calculateNumber.calcDigitsOne(101010));
    }

    @Test
    void test_count_calcDigitsOne_123414321_3_() {
        assertEquals(3, calculateNumber.calcDigitsOne(123414321));
    }

    @Test
    void test_calcNumbers_0_0__0() {
        assertEquals(0, calculateNumber.calcNumbers(0, 0));
    }

    @Test
    void test_calcNumbers_0_1__1() {
        assertEquals(1, calculateNumber.calcNumbers(0, 1));
    }

    @Test
    void test_calcNumbers_0_11__3() {
        assertEquals(4, calculateNumber.calcNumbers(0, 11));
    }

    @Test
    void test_calcNumbers_0_111__3() {
        assertEquals(36, calculateNumber.calcNumbers(0, 111));
    }

    @Test
    void test_findNumberOfNumbers_0_0__0() {
        assertEquals(0, calculateNumber.calcNumberOfOne(0, 0));
    }

    @Test
    void test_findNumberOfNumbers_0_1__1() {
        assertEquals(1, calculateNumber.calcNumberOfOne(0, 1));
    }

    @Test
    void test_findNumberOfNumbers_min1_0__1() {
        assertEquals(1, calculateNumber.calcNumberOfOne(-1, 0));
    }

    @Test
    void test_findNumberOfNumbers_min1_1__2() {
        assertEquals(2, calculateNumber.calcNumberOfOne(-1, 1));
    }

    @Test
    void test_findNumberOfNumbers_min11_1__2() {
        assertEquals(5, calculateNumber.calcNumberOfOne(-11, 1));
    }

    @Test
    void test_findNumberOfNumbers_min11_11__2() {
        assertEquals(8, calculateNumber.calcNumberOfOne(-11, 11));
    }

}
