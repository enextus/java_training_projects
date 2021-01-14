import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Solution sol = new Solution();

        ArrayList<Integer> listOfPoints = new ArrayList<>(Arrays.asList(new Integer[]{0, 1, 6, 8, 12, 23, 34, 44, 55, 77, 79, 89, 92, 100}));

        System.out.println("maxCoveredPoints: " + sol.maxCoveredPoints(listOfPoints, 55));
    }
}
