import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfSquares {
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);

        Long res = (Long) integerList.stream()
                .map(integer -> integer * integer)
                .collect(Collectors.summingLong(Integer::longValue));

        System.out.println(res);
    }

}
