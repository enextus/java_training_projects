import java.util.stream.IntStream;

public class IsNUmberPrime {

    public boolean isNumberPrime(int num) {

        boolean res;

        if (num == 1)
            return false;

        res = IntStream.range(2, num).noneMatch(i -> num % i == 0);

        return res;
    }

}
