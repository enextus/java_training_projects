public class Main {
    public static void main(String[] args) {
        PrimeNumbers primeNumbers = new PrimeNumbers();

/*        System.out.println(primeNumbers.isPrime(2));
        System.out.println(primeNumbers.isPrime(13));
        System.out.println(primeNumbers.isPrime(127));
        System.out.println(primeNumbers.isPrime(Integer.MAX_VALUE));*/

        int upperBound = 3079;

        System.out.println("\nList of prime numbers between 2 and " + upperBound + ":");

        for (Integer number : primeNumbers.getPrimes(upperBound))
            System.out.println(number + "; ");
    }
}
