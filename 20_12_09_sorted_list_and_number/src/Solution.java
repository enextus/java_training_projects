import java.util.*;

public class Solution {

    // O(n)
    public boolean solve(List<Integer> numbers, int n) {
//        Deque<Integer> deque = new LinkedList<>(numbers);
        Deque<Integer> deque = new ArrayDeque<>(numbers);

        System.out.println(deque.size());
        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());
        System.out.println(deque.getFirst() * deque.getLast());

        while (deque.size() >= 2) {
            int multiplication = deque.getFirst() * deque.getLast();

            if (multiplication > n) {
                System.out.println(deque.size());
                deque.removeLast();
                System.out.println(deque.size());
            } else if (multiplication < n) {
                deque.removeFirst();
            } else {
                return true;
            }
        }

        return false;
    }

/*    // O(n*n) - n is equal to size
    public boolean solve(List<Integer> numbers, int n) {
        ArrayList<Integer> list = new ArrayList<>(numbers);//O(n)
        int size = list.size();

        for (int i = 0; i < size; i++) {
            int a = list.get(i);
            for (int j = i + 1; j < size; j++) {
                int b = list.get(j);
                if (a * b == n)
                    return true;
            }
        }

        return false;
    }*/
}