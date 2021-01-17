import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {

        SolutionDeque sol = new SolutionDeque();

        Point point1 = new Point(2.0, 8.0);
        Point point2 = new Point(3.0, 3.0);
        Point point3 = new Point(3.0, 4.0);
        Point point4 = new Point(4.0, 5.0);
        Point point5 = new Point(5.0, 6.0);
        Point point6 = new Point(6.0, 7.0);
        Point point7 = new Point(6.0, 8.0);
        Point point8 = new Point(7.0, 2.0);
        Point point9 = new Point(8.0, 3.0);
        Point point10 = new Point(8.0, 6.0);
        Point point11 = new Point(9.0, 8.0);

        List<Point> pointsList = Arrays.asList(point1, point2, point3, point4, point5, point6, point7, point8, point9, point10, point11);
        Collections.sort(pointsList);

        for (Point pnt : pointsList)
            System.out.println(pnt);

    }
}
