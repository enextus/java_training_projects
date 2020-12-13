import java.util.Iterator;

public class OurLinkedList<T> implements OurList<T> {

    Node<T> first;
    Node<T> last;
    int size;

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(T element) {
        if (element == null)
            throw new NullPointerException("The first argument for add() is null.");

        if (!isEmpty()) {
            Node prev = last;
            last = new Node(null, null, element);
            prev.next = last;
        } else {
            last = new Node(null, null, element);
            first = last;
        }
        size++;
    }

    @Override
    public void addLast(T element) {
        if (element == null)
            throw new NullPointerException("The first argument for addLast() is null.");

        if (!isEmpty()) {
            Node prev = last;
            last = new Node(null, null, element);
            prev.next = last;
        } else {
            last = new Node(null, null, element);
            first = last;
        }
        size++;
    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public void set(int index, Object value) {

    }

    @Override
    public T removeById(int index) {
        return null;
    }

    /**
     * It returns the number of elements of the list.
     *
     * @return size
     */
    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean remove(Object obj) {
        return false;
    }

    @Override
    public boolean contains(Object obj) {
        return false;
    }

    @Override
    public Iterator forwardIterator() {
        return null;
    }

    @Override
    public Iterator backwardIterator() {
        return null;
    }

    private static class Node<T> {

        public Node<T> next;
        public Node<T> prev;

        public T data;

        public Node() {
        }

        public Node(Node<T> next, Node<T> prev, T element) {
            this.next = next;
            this.prev = prev;
            data = element;
        }
    }
}
