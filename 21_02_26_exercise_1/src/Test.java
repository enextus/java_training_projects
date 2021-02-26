import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 12, 34);

        Long res = (Long) integerList.stream()
                .mapToLong(integer -> (long) integer * integer)
                //   .reduce(0, Long::sum)
                .collect(Collectors.summingInt(Long::intValue));
        ;

        //  .collect(Collectors.summingInt(Long::intValue));

        System.out.println(res);

    }

}
