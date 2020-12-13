import java.util.Iterator;

public class OurLinkedList<T> implements OurList<T> {

    Node<T> first;
    Node<T> last;
    int size;

    /**
     * returns true if size more as 0
     *
     * @return boolean
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Appends the specified element to the end of this list.
     *
     * @param element
     */
    @Override
    public void add(T element) {
        if (element == null)
            throw new NullPointerException("The argument for add() is null.");

        if (!isEmpty()) {
            Node<T> prev = last;
            last = new Node<>(null, null, element);
            prev.next = last;
        } else {
            last = new Node<>(null, null, element);
            first = last;
        }
        size++;
    }

    /**
     * Removes the first occurrence of the specified element from this list, if it is present.
     * If this list does not contain the element, it is unchanged.
     *
     * @param element
     * @return result
     */
    @Override
    public boolean remove(T element) {
        if (isEmpty())
            throw new IllegalStateException("Can't remove() from and empty list.");

        boolean result = false;
        Node<T> prev = first;
        Node<T> curr = first;
        Node<T> next = last;

        while (curr.next != null || curr == last) {
            if (curr.data.equals(element)) {
                // remove the last remaining element
                if (size == 1) {
                    first = last = null;
                }
                // remove first element
                else if (curr.equals(first)) {
                    first = first.next;
                }
                // remove last element
                else if (curr.equals(last)) {
                    last = prev;
                    last.next = null;
                }
                // remove element
                else {
                    prev.next = curr.next; // перевод указателя на следующую node через удаляемую (удаление current node)
                    next.prev = curr.prev; // подключение новой node к "supply chain" к новой предыдущей
                }

                size--;
                result = true;

                break;
            }
            prev = curr;
            curr = prev.next;
        }

        return result;
    }

    /**
     * This method returns the element at the specified position in this list
     * Returns the value at a given index.
     * pre: 0 <= index < size
     * Throws a NullPointerException if index > size or index < 0.
     * @param index - index of the element to return. It must be in the range between 0 and (size-1).
     * @return result
     */
    @Override
    public T get(int index) {

        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("index was out of bounds");
        }

        Node<T> curr = first;

        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        return curr.data;
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
