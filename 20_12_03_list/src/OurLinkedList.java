public class OurLinkedList<T> implements Iterable<T>{

    private int size;
    private int modCount = 0;
    private Node<T> begin;
    private Node<T> end;

    public OurLinkedList()
    {
        doClear();
    }

    public void clear() {
        doClear();
    }

    private void doClear() {

        begin = new Node<T> (null, null, null);
        end = new Node<T> (null, begin, null);
        begin.next = end;

        size = 0;
        modCount++;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean add (T x) {

        add(size(), x);
        return true;

    }

    public void add(int idx, T x) {
        addBefore(getNode(idx, 0, size()), x);
    }

    public T get(int idx) {
        return getNode(idx).data;
    }

    public T set (int idx, T newVal) {
        Node<T> p = getNode(idx);
        T oldVal = p.data;
        p.data = newVal;
        return oldVal;
    }

    public T remove(int idx) {
        return remove(getNode(idx));
    }

    public void addBefore(Node<T> p, T x) {
        Node<T> newNode = new Node<T> (x, p.prev, p);
        newNode.prev.next = newNode;
        p.prev = newNode;
        size++;
        modCount++;
    }

    private T remove(Node<T> p) {
        p.next.prev = p.prev;
        p.prev.next = p.next;
        size--;
        modCount++;

        return p.data;

    }

    private Node<T> getNode(int idx){

        return getNode(idx, 0, size() - 1);
    }

    private Node<T> getNode(int idx, int lower, int upper){

        Node<T> p;

        if( idx < lower || idx > upper)
            throw new IndexOutOfBoundsException();

        if (idx < size() / 2) {
            p = begin.next;
            for (int i = 0; i < idx; i++)
                p = p.next;
        }
        else {
            p = end;
            for( int i = size(); i > idx; i--)
                p = p.prev;
        }

        return p;

    }



    public java.util.Iterator<T> iterator(){
        return new OurLinkedListIterator();
    }

    private class OurLinkedListIterator implements java.util.Iterator<T>{
        private Node<T> current = begin.next;
        private int expectedModCount = modCount;
        private boolean ok2Remove = false;


        public boolean hasNext() {
            return current != end;
        }

        public T next() {
            if (modCount != expectedModCount)
                throw new java.util.ConcurrentModificationException();
            if ( ! hasNext())
                throw new java.util.NoSuchElementException();

            T nextItem = current.data;
            current = current.next;
            ok2Remove = true;
            return nextItem;
        }

    }

}

class Node<AnyType>{

    public AnyType data;
    public Node<AnyType> prev;
    public Node<AnyType> next;
    public Node (AnyType d, Node<AnyType> p, Node<AnyType> n) {
        data = d; prev = p; next = n;
    }

    public String toString() {
        return data + "";
    }
}