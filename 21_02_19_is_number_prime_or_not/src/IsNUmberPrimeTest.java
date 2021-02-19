import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class IsNUmberPrimeTest {

    IsNUmberPrime isNUmberPrime = new IsNUmberPrime();

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
}