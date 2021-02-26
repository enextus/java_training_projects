import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1, 2, 3);

        Integer res =  integerList.stream()
                .map(n -> n * n)
                .collect(Collectors.summingInt(Integer::intValue));

        System.out.println(res);
    }

}
