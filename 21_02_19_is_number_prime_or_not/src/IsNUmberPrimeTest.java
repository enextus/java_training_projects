import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class IsNUmberPrimeTest {

    IsNUmberPrime isNUmberPrime = new IsNUmberPrime();

    @Test
    void test_isNumberPrime_1_false() {
        assertFalse(isNUmberPrime.isNumberPrime(1));
    }

    @Test
    void test_isNumberPrime_2_true() {
        assertTrue(isNUmberPrime.isNumberPrime(2));
    }

    @Test
    void test_isNumberPrime_3_true() {
        assertTrue(isNUmberPrime.isNumberPrime(3));
    }

    @Test
    void test_isNumberPrime_5_true() {
        assertTrue(isNUmberPrime.isNumberPrime(5));
    }

    @Test
    void test_isNumberPrime_97_true() {
        assertTrue(isNUmberPrime.isNumberPrime(97));
    }

    @Test
    void test_isNumberPrime_100_true() {
        assertFalse(isNUmberPrime.isNumberPrime(100));
    }

    @Test
    void test_isNumberPrime_1000_true() {
        assertFalse(isNUmberPrime.isNumberPrime(1000));
    }

    @Test
    void test_isNumberPrime_5000_true() {
        assertFalse(isNUmberPrime.isNumberPrime(5000));
    }
}
