import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class SumOfSquares {
    public static void main(String[] args) {

        List<Integer> integerLst = Arrays.asList(2147483647, 2147483647, 4, 5, 0, 10);

        AtomicInteger count = new AtomicInteger();

        Long res = integerLst.stream()
                .map((integer) -> {

                            count.getAndIncrement();

                            BigInteger multi = new BigInteger(String.valueOf(integer));
                            System.out.println("count: " + count + ", integer: " + multi + ", i*i: " + (multi.multiply(multi)));
                            return multi.multiply(multi);
                        }
                )
                .collect(Collectors.summingLong(/* Integer::longValue  */ (integer) -> {

                    return integer.longValue();
                }));

        System.out.println(res);
    }

}
