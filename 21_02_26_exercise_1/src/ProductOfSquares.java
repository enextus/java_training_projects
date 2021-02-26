import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

public class ProductOfSquares {
    public static void main(String[] args) {

        BigInteger res = BigInteger.valueOf(1);

        for (int i = 2; i <= 4; i++) {

            res = res.multiply(BigInteger.valueOf((long) i * i));
        }

        System.out.println(res);

    }
}
