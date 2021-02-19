import java.util.Arrays;
import java.util.List;

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
    }

}
