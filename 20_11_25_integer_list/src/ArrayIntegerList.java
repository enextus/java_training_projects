import java.util.Arrays;

public class ArrayIntegerList implements IntegerList {

    //class variables
    public static final int INITIAL_CAPACITY = 16;
    private int size;

    // instance variables
    int[] source;

    // constructor
    public ArrayIntegerList() {
        // init instance array with initial capacity of INITIAL_CAPACITY
        source = new int[INITIAL_CAPACITY];
        // init size
        size = 0;
    }

    // implementation of interface methods a...z
    void increaseCapacity() {
        int newCapacity = source.length * 2;
        int[] newSource = new int[newCapacity];
        System.arraycopy(source, 0, newSource, 0, source.length);
        source = newSource;
    }

    @Override
    public void addLast(int element) {
        if (size == source.length)
            increaseCapacity();

//        source[size++] = element;
        source[size] = element;
        size++;
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
        System.out.println(" ___   removeById   ______");
        System.out.println("source: " + Arrays.toString(source));
        System.out.println("source.length: " + source.length);
        System.out.println("size: " + size);
        System.out.println("________  ________");
        // guard clause
        if (source == null || index < 0 || index >= size)
            return -911;

        int removedValue = source[index];
        int[] newSource = new int[source.length - 1];

        for (int i = 0; i < index; i++)
            newSource[i] = source[i];

        // first part of result arr
        System.out.println("source: " + Arrays.toString(source));
        System.out.println("index to remove: " + index);
        System.out.println("newSource: " + Arrays.toString(newSource));
        System.out.println("newSource.length: " + newSource.length);
        System.out.println("________ first part of result arr ________");

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
