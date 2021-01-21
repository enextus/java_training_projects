import java.util.List;

public class PrimeNumbers {
    public List<Integer> getPrimes(int a, int b) {

        int loopLength = b - a + 1;
        int size = 0;

        for (int i = 0; i < loopLength; i++) {
            if (isPrime(a + i))
                size++;
        }

        int[] arr = new int[size];
        List<Integer> primeNumbers;


        int counter = 0;

        for (int i = 0; i < loopLength; i++) {

            if (isPrime(a + i))
                arr[counter] = a + i;
            else continue;

            counter++;
        }

        List<Integer> res = null;
        return res;
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
