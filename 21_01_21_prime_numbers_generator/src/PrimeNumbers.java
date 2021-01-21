import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {
    @Override
    public String toString() {
        return "PrimeNumbers{}";
    }

    public List<Integer> getPrimes(int upperBound) {

        int a = 2;

        int loopLength = upperBound - a + 1;
        int size = 0;

        for (int i = 0; i < loopLength; i++) {
            if (isPrime(a + i))
                size++;
        }

        List<Integer> primeNumbers = new ArrayList<>();

        for (int i = 0; i < loopLength; i++) {

            if (isPrime(a + i)) {
                primeNumbers.add(a + i);
            }
        }

        return primeNumbers;
    }

    public boolean isPrime(int number) {

        if (number % 2 == 0)
            return number == 2;

        int limit = (int) ((1 / 10) + Math.sqrt(number));

        for (int i = 3; i <= limit; i += 2) {
            if (number % i == 0)
                return false;
        }

        return true;
    }
}
