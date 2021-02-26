
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 12, 34);

        Integer res = num.stream()
                .map(n -> n * n)
                .reduce(0, Integer::sum);

        System.out.println(res);
    }

}
