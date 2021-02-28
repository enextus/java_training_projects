import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class SumOfSquares {
    public static void main(String[] args) {

        List<Integer> integerLst = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        AtomicInteger count = new AtomicInteger();
        Long res = integerLst.stream()
                .map((integer) -> {

                            count.getAndIncrement();
                            System.out.println("count: " + count + ", integer: " + integer + ", i*i: " + (integer * integer));


                            return integer * integer;
                        }
                )
                .collect(Collectors.summingLong(/* Integer::longValue  */ (integer) -> {

                    return integer.longValue();
                }));

        System.out.println(res);
    }

}
