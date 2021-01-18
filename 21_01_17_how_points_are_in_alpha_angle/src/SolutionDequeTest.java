import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.lang.Math.signum;
import static org.junit.jupiter.api.Assertions.*;

class SolutionDequeTest {

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

    {
        pointsList;
        pointsList.getClass();
    }
      Collections.sort();

    @Test
    void maxTrees() {
    }

    /**
     * ensure sgn(x.compareTo(y)) == -sgn(y.compareTo(x)) for all x and y.
     * (This implies that x.compareTo(y) must throw an exception iff y.compareTo(x) throws an exception.) </li>
     *
     * @param <Point>
     * @param o1
     * @param o2
     */

    @Test
    public static <Point extends Comparable<Point>> void assertComparisonReversal(Point o1, Point o2) {
        assertTrue(signum(o1.compareTo(o2)) == -signum(o2.compareTo((Point) o1)), "Comparison reversal should apply: sgn(o1.compareTo(o2)) == -sgn(o2.compareTo(o1)). ");
    }

    /**
     * comparator should be consistent with equals if and only if e1.compareTo(e2) == 0 has the same boolean value as
     * e1.equals(e2) for every e1 and e2 of class C
     *
     * @param o1
     * @param o2
     */
    public static <Point extends Comparable<Point>> void assertConsistencyWithEqual(Point o1, Point o2) {
        assertEquals("o1 and o2 should be equal. Before testing comparison. ", o1, o2);

        assertTrue("since o1 and o2 are equals, o1.compareTo(o2) should return zero!", o1.compareTo(o2) == 0);
    }

    /**
     * e.compareTo(null) should throw a NullPointerException
     *
     * @param o1
     */

    public static <T extends Comparable<Point>> void assertNullPointerException(T o1) {
        try {
            o1.compareTo(null);
            fail();
        } catch (NullPointerException e) {

        }
    }

    /**
     * (o3.compareTo(o2)>0 && o2.compareTo(o1)>0) implies o3.compareTo(o1)>0.
     *
     * @param o1
     * @param o2
     * @param o3
     */
    public static <T extends Comparable<Point>> void assertTransitivity(T o1, T o2, T o3) {
        assertTrue("(" + o3 + ".compareTo(" + o2 + ") > 0) && (" + o2 + ".compareTo(" + o1 + ") > 0 ) && ( " + o3 + ".compareTo(" + o1 + ") > 0 )", (o3.compareTo(o2) > 0) && (o2.compareTo(o1) > 0) && (o3.compareTo(o1) > 0));
    }

    /**
     * ensure that twinO1.compareTo(twinO2)==0 implies that sgn(twinO1.compareTo(differentO3)) == sgn(twinO2.compareTo(differentO3)), for all z.
     *
     * @param twinO1
     * @param twinO2
     * @param differentO3
     */
    public static <T extends Comparable<Point>> void assertConsistency(T twinO1, T twinO2, T differentO3) {
        assertTrue((twinO1.compareTo(twinO2) == 0) && (signum(twinO1.compareTo(differentO3)) == signum(twinO2.compareTo(differentO3))));
    }
}
