import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(0, 1, 3, 4, 11, 22, 24, 25, 26, 249, 270, 271, 272, 275, 276, 277, 360);
        SolutionDeque sol = new SolutionDeque();

        Point point1 = new Point(2, 8);
        Point point2 = new Point(3, 3);
        Point point3 = new Point(3, 4);
        Point point4 = new Point(4, 5);
        Point point5 = new Point(5, 6);
        Point point6 = new Point(6, 7);
        Point point7 = new Point(6, 8);
        Point point8 = new Point(7, 2);
        Point point9 = new Point(8, 3);
        Point point10 = new Point(8, 6);
        Point point11 = new Point(9, 8);

        List<Point> pointsList = Arrays.asList(point1, point2, point3, point4, point5, point6, point7, point8, point9, point10, point11);

        for (Point pnt:pointsList
             ) {
            System.out.println(pnt);
        }

        System.out.println(pointsList.get(0));
        System.out.println(pointsList.getClass());

        double a = 90.0;
        double b = 45.0;
        double c = 0.017453;

        System.out.format("%.1f радиан = %.3f градусов %n", a, Math.toDegrees(a));
        System.out.format("%.1f радиан = %.3f градусов %n", b, Math.toDegrees(b));
        System.out.format("%.6f радиан = %.5f градусу %n", c, Math.toDegrees(c));

        //System.out.println("Points: " + sol.coveredPoints(pointsList, 1));
    }
}
