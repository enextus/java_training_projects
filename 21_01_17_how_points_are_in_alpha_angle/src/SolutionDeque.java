import java.util.*;

import java.util.ArrayList;
import java.util.List;

public class SolutionDeque {
    public int maxTrees(List<Point> points, int rightCorner) {

        int maxPoints = 0;
        int cut = rightCorner;

        ArrayList<Point> pointArrayList = new ArrayList<>(points);
        ArrayDeque<Integer> maximusDeque = new ArrayDeque<>();

        for (int i = 0; i < pointArrayList.size(); i++) {

            for (int j = i; j < pointArrayList.size(); j++) {
                if (pointArrayList.get(j) - pointArrayList.get(i) <= cut) {

                    if (maximusDeque.isEmpty())
                        maximusDeque.addLast(1);
                    else
                        maximusDeque.addLast(maximusDeque.getLast() + 1);

                }
            }

            int size = maximusDeque.size();
            if (size >= maxPoints)
                maxPoints = size;

            maximusDeque.clear();
        }

        return maxPoints;
    }


}
