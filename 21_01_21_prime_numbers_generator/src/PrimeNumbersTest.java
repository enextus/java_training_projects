import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumbersTest {

    PrimeNumbers primeNumbers = new PrimeNumbers();

    @Test
    void getPrimes_Test_smaller_as_2() {
        assertEquals(null, primeNumbers.getPrimes(-1));
    }
}