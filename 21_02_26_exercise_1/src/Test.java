import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 12, 34);

        Long res2 = integerList.stream()
                .mapToLong(integer -> (long) integer * integer)
                .reduce(0, Long::sum);

        System.out.println(res2);

    }

}
