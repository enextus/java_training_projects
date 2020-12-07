import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        int[] array = {10, -8, 0, 15};

        Iterator<Integer> simpleArrayIterator = new SimpleArrayIterator(array);
        Iterator<Integer> revArrayIterator = new RevArrayIterator(array);

        while (simpleArrayIterator.hasNext()) {
            int current = simpleArrayIterator.next();
            System.out.println("current: " + current);
        }

        while (revArrayIterator.hasNext()) {
            int current = simpleArrayIterator.next();
            System.out.println("current: " + current);
        }

    }
}