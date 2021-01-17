import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {

        SolutionDeque sol = new SolutionDeque();

        Point point0 = new Point(2.1, 8.2);
        Point point1 = new Point(4.2, 16.4);
        Point point2 = new Point(3.0, 3.3);
        Point point3 = new Point(3.2, 4.4);
        Point point4 = new Point(4.9, 5.0);
        Point point5 = new Point(5.0, 6.5);
        Point point6 = new Point(6.3, 7.0);
        Point point7 = new Point(6.4, 8.2);
        Point point8 = new Point(7.5, 2.0);
        Point point9 = new Point(8.5, 3.3);
        Point point10 = new Point(8.5, 6.3);
        Point point11 = new Point(9.0, 8.9);
        Point point12 = new Point(3.3, 6.0);
        Point point13 = new Point(6.4, 2.2);
        Point point14 = new Point(5.5, 2.0);
        Point point15 = new Point(8.3, 5.3);
        Point point16 = new Point(8.2, 1.3);
        Point point17 = new Point(9.4, 8.9);

        List<Point> pointsList = Arrays.asList(point0, point1, point2, point3,
                point4, point5, point6, point7, point8, point9, point10,
                point11, point12, point13, point14, point15, point16, point17);

        Collections.sort(pointsList);

        for (Point pnt : pointsList)
            System.out.println(pnt);

        System.out.println("\nmaxTrees: " + sol.maxTrees(pointsList, 15));
    }
}
