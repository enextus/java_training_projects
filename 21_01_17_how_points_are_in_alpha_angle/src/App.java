import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(0, 1, 2, 4, 11, 22, 24, 25, 26, 31, 34, 44, 55, 100, 104, 108, 109, 110, 190, 210, 248, 249, 270, 360);
        SolutionDeque sol = new SolutionDeque();

        System.out.println("Points: " + sol.coveredPoints(integerList, 0, 20));
    }
}
