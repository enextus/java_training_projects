import java.text.NumberFormat;
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

        double a = 1.0;
        double b = 2.0;
        double c = 0.5;
        double d = Math.PI;
        double e = Math.PI;

        System.out.format("%.1f радиан = %.3f градусов %n", a, Math.toDegrees(a));
        System.out.format("%.1f радиан = %.3f градусов %n", b, Math.toDegrees(b));
        System.out.format("%.6f радиан = %.5f градусу %n", c, Math.toDegrees(c));
        System.out.format("%.6f радиан = %.5f градусу %n", d, Math.toDegrees(d));

        //System.out.println("Points: " + sol.coveredPoints(pointsList, 1));


        int x = 180 ; //градусы
        double radian = (Math.PI*x)/180; //перевод градусов в радианы
        double rez = Math.sin(radian); //входное значение в радианах
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(4);
        System.out.println("sin(" + x + ")градусов=" + nf.format(rez));
        //Переводим радианы в градусы, минуты, секунды (1 градус 60 минут или 360 секунд)
        double rad = 3.1416;
        double grad = (rad * 180) / Math.PI; //перевод из радиан в градусы
        int g = (int) grad;
        double min = (grad * 60) % 60;
        int m = (int) min;
        int sec = (int) (min * 60) % 60;
        System.out.println("радиан(" + rad + ")=" + g + "(градусов)" + "=" + m + "(минут)" + "=" + sec + "(секунд)");
        //Переводим в градусы, минуты, секунды в радианы
        int sec1 = 1;
        int min1 = 0;
        int grad1 = 180;
        int g1 = sec1/60/60 +min1/60 +grad1;
        double rad1 = (g1*Math.PI)/180 ;
        System.out.println(grad1 + "(градусов)" + "=" + min1 + "(минут)" + "=" + sec1 + "(секунд)"+"=" + nf.format(rad1)+ "(радиан)");

    }
}
