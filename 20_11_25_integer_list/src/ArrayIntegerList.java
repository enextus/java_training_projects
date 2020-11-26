import java.util.Arrays;

/**
 * class ArrayIntegerList implementation
 */
public class ArrayIntegerList implements IntegerList {
    //class variables
    public static final int INITIAL_CAPACITY = 16;
    private int size;

    // instance variable
    int[] source;

    /**
     * Constructor.
     */
    public ArrayIntegerList() {
        // init instance array with initial capacity of INITIAL_CAPACITY
        source = new int[INITIAL_CAPACITY];
        // init class variable size with zero value
        size = 0;
    }

    /**
     * Method doubles the length of source.
     */
    private void increaseCapacity() {
        int newCapacity = source.length * 2;
        int[] newSource = new int[newCapacity];
        System.arraycopy(source, 0, newSource, 0, source.length);

        source = newSource;
    }

    /**
     * Method adds an element at the end of array and increase the length of it.
     * @param element - to add
     */
    @Override
    public void addLast(int element) {
        if (size == source.length)
            increaseCapacity();

//        source[size++] = element;
        source[size] = element;

        size++;
    }

    /**
     * Method returns the element at the index.
     * @param index - index of the element to return. It must be in the range between 0 and (size-1).
     * @return element
     */
    @Override
    public int get(int index) {
        if (index >= size || index < 0)
            throw new IndexOutOfBoundsException();

        return source[index];
    }

    /**
     * Method sets new value of element with index.
     * @param index the place to set
     * @param value the value to set
     */
    @Override
    public void set(int index, int value) {
        if (index >= size || index < 0)
            throw new IndexOutOfBoundsException();

        source[index] = value;
    }

    /**
     * Method removes element with index.
     * @param index the index of the element to remove
     * @return value of removed element
     */
    @Override
    public int removeById(int index) {
        if (source == null || index < 0 || index >= size)
            return -911;

        int removedValue = source[index];

        int numElements = source.length - (index + 1);
        System.arraycopy(source, index + 1, source, index, numElements);

        size--;

        return removedValue;
    }

    /**
     * Method returns value of size. Like a getter.
     * @return size
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Method clears the elements from source.
     */
    @Override
    public void clear() {
        for (int i = 0; i < size; i++)
            source[i] = 0;

        size = 0;
    }

    @Override
    public String toString() {
        return "ArrayIntegerList{" +
                "size=" + size +
                ", source=" + Arrays.toString(source) +
                '}';
    }
}
