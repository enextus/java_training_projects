import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 12, 34);

        Long res = num.stream()
                .mapToLong(integer -> (long) integer * integer)
                .reduce(0, Long::sum);

        System.out.println(res);


        List<Integer> num2 = Arrays.asList(1, 2, 3, 4, 5, 12, 34);

        Long res2 = num2.stream()
                .mapToLong(integer -> (long) integer * integer)
                .reduce(0, Long::sum);

        System.out.println(res2);


    }

}
