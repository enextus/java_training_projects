import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        List<Cut> lstCut = Arrays.asList(
                new Cut(-100, -90),
                new Cut(-5, 5),
                new Cut(40, 80)
        );

        System.out.println("lstCut: " + lstCut);

        List<Integer> integers = Arrays.asList(-110, -4, -1, 0, 20, 45, 100);

        System.out.println("integers: " + integers);
        System.out.println("\n");

        Solve solve = new Solve(lstCut, integers);

        solve.solve();


        Function<Integer, String> convert = x -> String.valueOf(x) + " долларов";


        System.out.println(convert.apply(5)); // 5 долларов

    }

}
