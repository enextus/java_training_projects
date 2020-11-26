public class ArrayIntegerList implements IntegerList {

    private static final int INITIAL_CAPACITY = 16;

    private int size;
    int[] source;

    public ArrayIntegerList() {
        source = new int[INITIAL_CAPACITY];
    }

    @Override
    public void addLast(int element) {
        if (size == source.length)
            increaseCapacity();

//        source[size++] = element;
        source[size] = element;
        size++;
    }

    void increaseCapacity() {
        int newCapacity = source.length * 2;
        int[] newSource = new int[newCapacity];
        System.arraycopy(source, 0, newSource, 0, source.length);
        source = newSource;
    }

    @Override
    public int get(int index) {
        if (index >= size || index < 0)
            throw new IndexOutOfBoundsException();

        return source[index];
    }

    @Override
    public void set(int index, int value) {

    }

    @Override
    public int removeById(int index) {
        return 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        final int arrLen = source.length;
        int count = 0;
        final int length = source.length;
        while (arrLen - count > length) {
            System.arraycopy(source, 0, source, count, length);
            count += length;
        }
        System.arraycopy(source, 0, source, count, arrLen - count);
    }
}
