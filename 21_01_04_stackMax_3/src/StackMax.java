import java.util.ArrayDeque;

public class StackMax {

    private final ArrayDeque<Integer> source;
    private final ArrayDeque<Integer> currentMax;

    public StackMax() {
        source = new ArrayDeque<>();
        currentMax = new ArrayDeque<>();
    }

    public void addLast(int elt) {
        source.addLast(elt);
    }

    public int getLast() {
        return source.getLast();
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