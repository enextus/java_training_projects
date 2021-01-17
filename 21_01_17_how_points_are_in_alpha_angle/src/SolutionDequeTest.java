import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionDequeTest<pointsList> implements Comparable<Point>{

    SolutionDeque sol = new SolutionDeque();

    Point point0 = new Point(-2.1, 8.2);
    Point point1 = new Point(-4.2, -16.4);
    Point point2 = new Point(3.0, 3.3);
    Point point3 = new Point(7.2, 7.4);
    Point point4 = new Point(4.9, 5.0);
    Point point5 = new Point(5.0, 6.5);
    Point point6 = new Point(6.3, 7.0);
    Point point7 = new Point(6.4, 8.2);
    Point point8 = new Point(-7.5, -2.0);
    Point point9 = new Point(8.5, 33.3);
    Point point10 = new Point(6.5, 6.3);
    Point point11 = new Point(0.5, 0.9);
    Point point12 = new Point(-3.3, -6.0);
    Point point13 = new Point(26.4, 2.2);
    Point point14 = new Point(5.5, 2.0);
    Point point15 = new Point(8.3, 5.3);
    Point point16 = new Point(3.2, 1.3);
    Point point17 = new Point(-9.4, -8.9);
    Point point18 = new Point(-5.5, -2.0);
    Point point19 = new Point(8.9, 9.9);
    Point point20 = new Point(2.2, -1.3);
    Point point21 = new Point(-9.4, -8.9);

    List<Point> pointsList = Arrays.asList(point0, point1, point2, point3,
            point4, point5, point6, point7, point8, point9, point10,
            point11, point12, point13, point14, point15, point16, point17,
            point18, point19, point20, point21);

/*        Collections.sort(pointsList);

    @Test
    void maxTrees(pointsList, 0) {
    }

    @Override
    public int compareTo(Point other) {
        if (this.getRad() < other.getRad())
            return -1;
        else if (other.getRad() < this.getRad())
            return 1;
        return 0;
    }*/
}