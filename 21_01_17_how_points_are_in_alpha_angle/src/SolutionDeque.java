import java.util.*;

import java.util.ArrayList;
import java.util.List;

public class SolutionDeque {
    public int maxTrees(List<Point> points, int alpha) {

        int maxPoints = 0;
        double angleRad = (alpha * Math.PI) / 180;

        ArrayList<Point> arrayList = new ArrayList<>(points);
        ArrayDeque<Integer> maximsDeque = new ArrayDeque<>();

        for (int i = 0; i < arrayList.size(); i++) {

            for (int j = i; j < arrayList.size(); j++) {
                if (arrayList.get(j).getRad() - arrayList.get(i).getRad() <= angleRad) {
                    if (maximsDeque.isEmpty())
                        maximsDeque.addLast(1);
                    else
                        maximsDeque.addLast(maximsDeque.getLast() + 1);
                }
            }

            int size = maximsDeque.size();

            System.out.println("\nmaximsDeque.size(): " + maximsDeque.size());

            if (size > maxPoints)
                maxPoints = size;

            maximsDeque.clear();
        }

        return maxPoints;
    }
}
