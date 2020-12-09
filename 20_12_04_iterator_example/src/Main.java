import java.util.Arrays;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        int[] array = {10, -8, 0, 15};
        System.out.println(getLineNumber() + "   " + Arrays.toString(array));

/*        Iterator<Integer> simpleArrayIterator = new SimpleArrayIterator(array);
        Iterator<Integer> backwardArrayIterator = new BackwardArrayIterator(array);
        Iterator<Integer> increasingArrayIterator = new IncreasingArrayIterator(array);

        SimpleArrayIterator simpleArrayIterator = new SimpleArrayIterator(array);
        BackwardArrayIterator backwardArrayIterator = new BackwardArrayIterator(array);
        IncreasingArrayIterator increasingArrayIterator = new IncreasingArrayIterator(array);

        Iterator simpleArrayIterator = new SimpleArrayIterator(array);
        Iterator backwardArrayIterator = new BackwardArrayIterator(array);
        Iterator increasingArrayIterator = new IncreasingArrayIterator(array);*/

        Object simpleArrayIterator = new SimpleArrayIterator(array);
        Object backwardArrayIterator = new BackwardArrayIterator(array);
        Object increasingArrayIterator = new IncreasingArrayIterator(array);

        iterate(simpleArrayIterator);
        iterate(backwardArrayIterator);
        iterate(increasingArrayIterator);
    }

    static void iterate(Iterator<Integer> iterator) {

        System.out.print(getLineNumber() + "   " + "");
        System.out.print("[");
        while (iterator.hasNext()) {
            int current = iterator.next();
            System.out.print(current);
            if (iterator.hasNext()) System.out.print(", ");
        }
        System.out.println(
                "]");
    }

    /**
     * Get the current line number.
     *
     * @return int - Current line number.
     */
    static int getLineNumber() {
        return Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

}
