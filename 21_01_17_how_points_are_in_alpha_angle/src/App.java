import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {

        SolutionDeque sol = new SolutionDeque();

        List<Point> pointsList = Arrays.asList(
                new Point(-2.1, 8.2),
                new Point(-4.2, -16.4),
                new Point(3.0, 3.3),
                new Point(7.2, 7.4),
                new Point(4.9, 5.0),
                new Point(5.0, 6.5),
                new Point(6.3, 7.0),
                new Point(6.4, 8.2),
                new Point(-7.5, -2.0),
                new Point(8.5, 33.3),
                new Point(6.5, 6.3),
                new Point(0.5, 0.9),
                new Point(-3.3, -6.0),
                new Point(26.4, 2.2),
                new Point(5.5, 2.0),
                new Point(8.3, 5.3),
                new Point(3.2, 1.3),
                new Point(-9.4, -8.9),
                new Point(-5.5, -2.0),
                new Point(8.9, 9.9),
                new Point(2.2, -1.3),
                new Point(-9.4, -8.9)
        );

        Collections.sort(pointsList);

        for (Point pnt : pointsList)
            System.out.println(pnt);

        System.out.println("\nmaxTrees: " + sol.maxTrees(pointsList, 359));

    }

}
