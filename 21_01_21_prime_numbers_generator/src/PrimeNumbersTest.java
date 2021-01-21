import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumbersTest {

    PrimeNumbers primeNumbers = new PrimeNumbers();

    @Test
    void isPrime_Test_smaller_as_2() {
        assertTrue(primeNumbers.isPrime(2));
    }

    @Test
    void isPrime_Test_smaller_as_127() {
        assertTrue(primeNumbers.isPrime(127));
    }

    @Test
    void isPrime_Test_smaller_as_4() {
        assertFalse(primeNumbers.isPrime(4));
    }

    @Test
    void isPrime_Test_smaller_as_126() {
        assertFalse(primeNumbers.isPrime(126));
    }

    @Test
    void isPrime_Test_Integer_MAX_VALUE() {
        assertTrue(primeNumbers.isPrime(Integer.MAX_VALUE));
    }

    @Test
    void getPrimes_Test_smaller_as_2() {
        assertNull(primeNumbers.getPrimes(-1));
        assertNull(primeNumbers.getPrimes(-0));
        assertNull(primeNumbers.getPrimes(1));
    }

    @Test
    void getPrimes_Test_smallest_Prime_2() {
        assertEquals(new ArrayList<>(Arrays.asList(2)), primeNumbers.getPrimes(2));
    }

    @Test
    void getPrimes_Test_smallest_Prime_13() {
        assertEquals(new ArrayList<>(Arrays.asList(2, 3, 5, 7, 11, 13)), primeNumbers.getPrimes(13));
    }
}
