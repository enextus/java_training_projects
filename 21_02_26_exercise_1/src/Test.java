import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 12, 34);

        Long res = num.stream()
                .mapToLong(n -> n * n)
                .reduce(0, Long::sum);

        System.out.println(res);
    }

}
