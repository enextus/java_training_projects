import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    private static Object List;

    public static void main(String[] args) {

        Solution sol = new Solution();

        List<Integer> integerList = Arrays.asList(0, 1, 6, 8, 12, 22, 34, 44, 55, 77, 79, 89, 92, 100);

        System.out.println("maxCoveredPoints: " + sol.maxCoveredPoints(integerList, 55));
    }
}

//        int[] integers = {0, 1, 6, 8, 12, 22, 34, 44, 55, 77, 79, 89, 92, 100};
//        List<Integer> integerList = new ArrayList<Integer>(integers.length);
//        for (int i : ints)
//            integerList.add(i);
