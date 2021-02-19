import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        // write your code here

        List<String> lstStr = Arrays.asList("abc", "abc", "abc", "bcd", "bcd", "efg", "efg");

        System.out.println(lstStr);

        Function<List<String>, List<String>> resLst = (List<String> lst) -> {

            System.out.println("1.");
            System.out.println("2.");

            return lst;
        };

        resLst.apply(lstStr);
    }
}
