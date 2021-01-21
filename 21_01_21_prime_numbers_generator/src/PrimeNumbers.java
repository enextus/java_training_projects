import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {

    public List<Integer> getPrimes(int upperBound) {

        if (upperBound < 2)
            return null;

        int smallestPrimeNumber = 2;
        int loopLength = upperBound - smallestPrimeNumber + 1;

        List<Integer> primeNumbers = new ArrayList<>();

        for (int i = 0; i < loopLength; i++) {
            if (isPrime(smallestPrimeNumber + i))
                primeNumbers.add(smallestPrimeNumber + i);
        }

        return primeNumbers;
    }

    boolean isPrime(int number) {

        if(number == 1)
            return false;

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
