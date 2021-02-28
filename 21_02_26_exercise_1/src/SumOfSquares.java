import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfSquares {
    public static void main(String[] args) {

        List<Integer> integerLst = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        Long res = (Long) integerLst.stream()
                .map((integer) -> {

                            return integer * integer;
                        }
                )
                .collect(Collectors.summingLong(Integer::longValue));

        System.out.println(res);
    }

}
