import java.util.*;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        List<String> initLstStr = Arrays.asList("abc", "abc", "abc", "bcd", "bcd", "efg", "efg");

        Function<List<String>, List<String>> lambdaFunc = (List<String> lst) -> {
            Set<String> tmpSet = new HashSet<>(lst);

            return new ArrayList<>(tmpSet);
        };

        System.out.println("Initial list: " + initLstStr);
        System.out.println("Resulted list: " + lambdaFunc.apply(initLstStr));

        /*
        Initial list:   [abc, abc, abc, bcd, bcd, efg, efg]
        Resulted list:  [bcd, abc, efg]
        */

    }

}
