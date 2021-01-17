import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(0, 1, 6, 8, 12, 22, 31, 34, 44, 55, 100);
        Solution sol = new Solution();

        System.out.println("maxCoveredPoints: " + sol.maxCoveredPoints(integerList, 4, 22));
    }
}
