import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Solution sol = new Solution();

        Integer[] points;
        List<Integer> listOfPoints;

        points = new Integer[]{1, 6, 12, 44, 55, 77, 79, 89, 92, 100};
        listOfPoints = Arrays.asList(points);

        System.out.println("maxCoveredPoints: " + sol.maxCoveredPoints(listOfPoints, 55));
    }
}
