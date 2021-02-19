import java.util.*;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        List<String> lstStr = Arrays.asList("abc", "abc", "abc", "bcd", "bcd", "efg", "efg");

        Function<List<String>, List<String>> resLst = (List<String> lst) -> {
            Set<String> resSet = new HashSet<String>(lst);

            List<String> result = new ArrayList<String>();
            result.addAll(resSet);

            return (List<String>) result;
        };

        System.out.println(resLst.apply(lstStr));
    }

}
