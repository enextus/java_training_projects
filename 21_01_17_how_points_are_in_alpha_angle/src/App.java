import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(0, 1, 3, 4, 11, 22, 24, 25, 26, 249,  270, 271, 272, 275, 276, 277,  360);
        SolutionDeque sol = new SolutionDeque();

        System.out.println("Points: " + sol.coveredPoints(integerList, 0, 24));
    }
}
