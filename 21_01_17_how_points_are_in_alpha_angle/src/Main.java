import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(0, 1, 4, 5, 13, 22, 31, 34, 44, 55, 100, 190, 210, 245, 270, 360);
        Solution sol = new Solution();

        System.out.println("points: " + sol.coveredPoints(integerList, 100, 180));
    }
}
