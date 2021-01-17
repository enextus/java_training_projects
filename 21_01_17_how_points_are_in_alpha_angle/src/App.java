import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(0, 1, 3, 4, 11, 22, 24, 25, 26, 249, 270, 271, 272, 275, 276, 277, 360);
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

        for (Point pnt : pointsList
        ) {
            System.out.println(pnt);
        }


        Point poi_1_1 = new Point(1, 1);
        System.out.println(poi_1_1.getX());
        System.out.println(poi_1_1.getY());

        double hypotenuse2 = Math.sqrt((Math.pow(poi_1_1.getY(), 2)) + (Math.pow(poi_1_1.getX(), 2)));
        double sinx2 = poi_1_1.getX() / (Math.sqrt((Math.pow(poi_1_1.getY(), 2)) + (Math.pow(poi_1_1.getX(), 2))));

        System.out.println("sinx2: " + sinx2);
        System.out.println("Angle_in_Radian: " + Math.asin(sinx2));
        System.out.println("Angle_in_Grad: " + Math.toDegrees(Math.asin(sinx2)));

    }

}