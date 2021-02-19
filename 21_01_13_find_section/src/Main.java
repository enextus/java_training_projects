import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Solution sol = new Solution();

        List<Integer> integerList = Arrays.asList(0, 1, 6, 8, 12, 22, 34, 44, 55, 77, 79, 89, 92, 100);

        System.out.println(integerList.getClass());

        System.out.println("maxCoveredPoints: " + ((Solution) sol).maxCoveredPoints(integerList, 55));
    }
}
