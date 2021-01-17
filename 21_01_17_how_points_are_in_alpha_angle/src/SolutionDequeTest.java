import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionDequeTest<pointsList> implements Comparable<Point>{

    SolutionDeque sol = new SolutionDeque();

    @Override
    public int compareTo(Point o) {
        return 0;
    }
}