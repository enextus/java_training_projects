import java.util.ArrayDeque;

public class StackMax {

    private final ArrayDeque<Integer> dequeElem;
    private final ArrayDeque<Integer> dequeMaxs;

    public StackMax() {
        dequeElem = new ArrayDeque<>();
        dequeMaxs = new ArrayDeque<>();
    }

    public void addLast(int elt) {
        dequeElem.addLast(elt);
    }

    public int getLast() {
        return dequeElem.getLast();
    }

    public int removeLast() {
        return 0;
    }

    public int size() {
        return 0;
    }

    public int getMax() {
        // foreach here over all the elements of the 'source'
        return 0;
    }
}