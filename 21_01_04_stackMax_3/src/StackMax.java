import java.util.ArrayDeque;

public class StackMax {

    private final ArrayDeque<Integer> dequeElem;
    private final ArrayDeque<Integer> dequeMaxs;

    public StackMax() {
        this.dequeElem = new ArrayDeque<>();
        this.dequeMaxs = new ArrayDeque<>();
    }

    public void addLast(int elt) {
        dequeElem.addLast(elt);

        if (dequeMaxs.isEmpty()) {
            dequeMaxs.addLast(elt);
        } else {
            if (elt > dequeMaxs.getLast()) {
                dequeMaxs.addLast(elt);
            } else {
                dequeMaxs.addLast(dequeMaxs.getLast());
            }
        }
    }


    public int getLast() {
        if (dequeElem.isEmpty())
            throw new IndexOutOfBoundsException();

        return dequeElem.getLast();
    }

    public int removeLast() {
        if (dequeElem.isEmpty())
            throw new IndexOutOfBoundsException();

        dequeMaxs.removeLast();

        return dequeElem.removeLast();
    }

    public int size() {
        return dequeElem.size();
    }

    public int getMax() {
        if (dequeElem.isEmpty())
            throw new IndexOutOfBoundsException();

        return dequeMaxs.getLast();
    }
}