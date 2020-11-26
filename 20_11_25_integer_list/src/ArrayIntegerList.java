public class ArrayIntegerList implements IntegerList {

    private static final int INITIAL_CAPACITY = 16;

    private int size;
    int[] source;

    //
    public ArrayIntegerList() {
        source = new int[INITIAL_CAPACITY];
    }

    //
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
        if (index >= size || index < 0)
            throw new IndexOutOfBoundsException();

        int[] newSource = new int[source.length + 1];

        for (int i = 0; i < index; i++)
            newSource[i] = source[i];

        newSource[index] = value;

        for (int i = index + 1; i <= source.length; i++)
            newSource[i] = source[i - 1];

        source = newSource;
        size++;
    }

    @Override
    public int removeById(int index) {

        if (source == null || index < 0 || index >= size) {
            return 0;
        }

        int removedValue = source[index];

        int[] newSource = new int[source.length - 1];

        for (int i = 0; i < index; i++)
            newSource[i] = source[i];

        for (int i = index; i < source.length - 1; i++)
            newSource[i] = source[i + 1];

        source = newSource;
        size--;
        return removedValue;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++)
            source[i] = 0;

        size = 0;
    }
}
