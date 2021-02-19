import java.util.*;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        List<String> initLstStr = Arrays.asList("abc", "abc", "abc", "bcd", "bcd", "efg", "efg");

        Function<List<String>, List<String>> lambdaFunc = (List<String> lst) -> {

            Set<String> tmpSet = new HashSet<>(lst);
            List<String> resLst = new ArrayList<>(tmpSet);

            return resLst;
        };

        System.out.println(lambdaFunc.apply(initLstStr));
    }

}
