import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionDequeTest {

    SolutionDeque sol = new SolutionDeque();

    List<Point> pointsList = Arrays.asList(
            new Point(7.1, 8.2),
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

    List<Point> pointsListIn4Quarts = Arrays.asList(
            new Point(Math.sqrt(2) / 2, Math.sqrt(2) / 2),
            new Point(-(Math.sqrt(2) / 2), Math.sqrt(2) / 2),
            new Point(-(Math.sqrt(2) / 2), -(Math.sqrt(2) / 2)),
            new Point(Math.sqrt(2) / 2, -(Math.sqrt(2) / 2))
    );

    List<Point> pointsListIn4QuartsBut8Points = Arrays.asList(
            new Point(1, 0),
            new Point(Math.sqrt(2) / 2, Math.sqrt(2) / 2),
            new Point(0, 1),
            new Point(-(Math.sqrt(2) / 2), Math.sqrt(2) / 2),
            new Point(-1, 0),
            new Point(-(Math.sqrt(2) / 2), -(Math.sqrt(2) / 2)),
            new Point(-1, 0),
            new Point(Math.sqrt(2) / 2, -(Math.sqrt(2) / 2))
    );

/*    @Test
    void maxTrees_Test_print_all() {
        Collections.sort(pointsList);

        for (Point pnt : pointsList)
            System.out.println(pnt);

        System.out.println("\nmaxTrees: " + sol.maxTrees(pointsList, 90));
    }*/

    @Test
    void maxTrees_Test_test_size() {
        Collections.sort(pointsList);
        assertEquals(21, pointsList.size());
    }

    @Test
    void maxTrees_Test_empty_angle_alpha_and_one_Point_in_zero_coordinates() {
        List<Point> pointsList = Collections.singletonList(new Point(0, 0));

        assertEquals(0, sol.maxTrees(pointsList, 0));
    }

    @Test
    void maxTrees_Test_alpha_and_one_Point_in_the_I_coordinate_quarter() {
        List<Point> pointsList = Collections.singletonList(new Point(Math.sqrt(2) / 2, Math.sqrt(2) / 2));

        assertEquals(1, sol.maxTrees(pointsList, 1));
        assertEquals(1, sol.maxTrees(pointsList, 15));
        assertEquals(1, sol.maxTrees(pointsList, 45));
        assertEquals(1, sol.maxTrees(pointsList, 90));
        assertEquals(1, sol.maxTrees(pointsList, 180));
        assertEquals(1, sol.maxTrees(pointsList, 270));
        assertEquals(1, sol.maxTrees(pointsList, 360));
    }

    @Test
    void maxTrees_Test_alpha_and_one_Point_in_the_II_coordinate_quarter() {
        List<Point> pointsList = Collections.singletonList(new Point(-(Math.sqrt(2) / 2), Math.sqrt(2) / 2));

        assertEquals(1, sol.maxTrees(pointsList, 1));
        assertEquals(1, sol.maxTrees(pointsList, 15));
        assertEquals(1, sol.maxTrees(pointsList, 45));
        assertEquals(1, sol.maxTrees(pointsList, 90));
        assertEquals(1, sol.maxTrees(pointsList, 180));
        assertEquals(1, sol.maxTrees(pointsList, 270));
        assertEquals(1, sol.maxTrees(pointsList, 360));
    }

    @Test
    void maxTrees_Test_alpha_and_one_Point_in_the_III_coordinate_quarter() {
        List<Point> pointsList = Collections.singletonList(new Point(-(Math.sqrt(2) / 2), -(Math.sqrt(2) / 2)));

        assertEquals(1, sol.maxTrees(pointsList, 1));
        assertEquals(1, sol.maxTrees(pointsList, 15));
        assertEquals(1, sol.maxTrees(pointsList, 45));
        assertEquals(1, sol.maxTrees(pointsList, 90));
        assertEquals(1, sol.maxTrees(pointsList, 180));
        assertEquals(1, sol.maxTrees(pointsList, 270));
        assertEquals(1, sol.maxTrees(pointsList, 360));
    }

    @Test
    void maxTrees_Test_alpha_and_one_Point_in_the_IV_coordinate_quarter() {
        List<Point> pointsList = Collections.singletonList(new Point(Math.sqrt(2) / 2, -(Math.sqrt(2) / 2)));

        assertEquals(1, sol.maxTrees(pointsList, 1));
        assertEquals(1, sol.maxTrees(pointsList, 15));
        assertEquals(1, sol.maxTrees(pointsList, 45));
        assertEquals(1, sol.maxTrees(pointsList, 90));
        assertEquals(1, sol.maxTrees(pointsList, 180));
        assertEquals(1, sol.maxTrees(pointsList, 270));
        assertEquals(1, sol.maxTrees(pointsList, 360));
    }

    @Test
    void maxTrees_Test_angle_alpha_and_4_Points_in_all_quarters() {
        Collections.sort(pointsListIn4Quarts);

        assertEquals(4, sol.maxTrees(pointsListIn4Quarts, 360));
    }

    @Test
    void maxTrees_Test_90_angle_alpha_and_2_Points_in_all_quarters() {
        Collections.sort(pointsListIn4Quarts);

        assertEquals(2, sol.maxTrees(pointsListIn4Quarts, 90));
    }

    @Test
    void maxTrees_Test_150_angle_alpha_and_2_Points_in_all_quarters() {
        Collections.sort(pointsListIn4Quarts);

        assertEquals(4, sol.maxTrees(pointsListIn4Quarts, 180));
    }

    @Test
    void maxTrees_Test_360_angle_alpha_and_8_Points_in_all_quarters() {
        Collections.sort(pointsListIn4QuartsBut8Points);

        assertEquals(8, sol.maxTrees(pointsListIn4QuartsBut8Points, 360));
    }

    @Test
    void maxTrees_Test_45_plus_upwards_angle_alpha_and_8_Points_in_all_quarters() {
        Collections.sort(pointsListIn4QuartsBut8Points);

        for (Point pnt : pointsListIn4QuartsBut8Points)
            System.out.println(pnt);

        System.out.println("\nmaxTrees: " + sol.maxTrees(pointsListIn4QuartsBut8Points, 1));

        assertEquals(1, sol.maxTrees(pointsListIn4QuartsBut8Points, 1));
        //assertEquals(2, sol.maxTrees(pointsListIn4QuartsBut8Points, 45));
        //assertEquals(3, sol.maxTrees(pointsListIn4QuartsBut8Points, 90));
        //assertEquals(4, sol.maxTrees(pointsListIn4QuartsBut8Points, 135));
        //assertEquals(5, sol.maxTrees(pointsListIn4QuartsBut8Points, 180));
        //assertEquals(6, sol.maxTrees(pointsListIn4QuartsBut8Points, 225));
        //assertEquals(7, sol.maxTrees(pointsListIn4QuartsBut8Points, 270));
        //assertEquals(8, sol.maxTrees(pointsListIn4QuartsBut8Points, 315));
        //assertEquals(8, sol.maxTrees(pointsListIn4QuartsBut8Points, 360));
    }
}
