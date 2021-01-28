import java.util.ArrayDeque;

public class StackMax {

    private final ArrayDeque<Integer> dequeElem;
    private final ArrayDeque<Integer> dequeMaxis;

    public StackMax() {
        this.dequeElem = new ArrayDeque<>();
        this.dequeMaxis = new ArrayDeque<>();
    }

    public void addLast(int elt) {
        dequeElem.addLast(elt);

        if (dequeMaxis.isEmpty()) {
            dequeMaxis.addLast(elt);
        } else {
            if (elt > dequeMaxis.getLast()) {
                dequeMaxis.addLast(elt);
            } else {
                dequeMaxis.addLast(dequeMaxis.getLast());
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

        dequeMaxis.removeLast();

        return dequeElem.removeLast();
    }

    public int size() {
        return dequeElem.size();
    }

    public int getMax() {
        if (dequeElem.isEmpty())
            throw new IndexOutOfBoundsException();

        return dequeMaxis.getLast();
    }

}
