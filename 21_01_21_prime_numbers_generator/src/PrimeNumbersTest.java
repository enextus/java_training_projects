import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumbersTest {

    PrimeNumbers primeNumbers = new PrimeNumbers();

    @Test
    void isPrime_Test_smaller_as_2() {
        assertEquals(true, primeNumbers.isPrime(2));
    }

    @Test
    void isPrime_Test_smaller_as_127() {
        assertEquals(true, primeNumbers.isPrime(127));
    }

    @Test
    void isPrime_Test_smaller_as_4() {
        assertEquals(false, primeNumbers.isPrime(4));
    }

    @Test
    void isPrime_Test_smaller_as_126() {
        assertEquals(false, primeNumbers.isPrime(126));
    }

    @Test
    void getPrimes_Test_smaller_as_2() {
        assertEquals(null, primeNumbers.getPrimes(-1));
        assertEquals(null, primeNumbers.getPrimes(-0));
        assertEquals(null, primeNumbers.getPrimes(1));
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
