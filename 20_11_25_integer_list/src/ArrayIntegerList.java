import java.util.Arrays;
import java.util.Objects;

/*
 * class ArrayIntegerList one of possibles implementation
 */
public class ArrayIntegerList implements IntegerList {
    public int[] getSource() {
        return source;
    }

    //class variable
    public static final int INITIAL_CAPACITY = 16;

    // instance variables
    private int size;
    int[] source; // package protected

    /*
     * Class constructor.
     */
    public ArrayIntegerList() {
        // init instance array with initial capacity of INITIAL_CAPACITY
        source = new int[INITIAL_CAPACITY];
        // init class variable size with zero value
        size = 0;
    }

    /*
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
     *
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
     * The method returns the value of the element at its index.
     *
     * @param index - index of the element to return. It must be in the range between 0 and (size-1).
     * @return value of the element at its index
     */
    @Override
    public int get(int index) {
        if (index >= size || index < 0)
            throw new IndexOutOfBoundsException();

        return source[index];
    }

    /**
     * Method sets new value of element with index.
     *
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
     *
     * @param index the index of the element to remove
     * @return value of removed element
     */
    @Override
    public int removeById(int index) {
/*        if (index < 0 || index >= size)
            return -911;*/

        int valueRemovedElem = source[index];

        int numElements = source.length - (index + 1);
        System.arraycopy(source, index + 1, source, index, numElements);

        size--;

        return valueRemovedElem;
    }

    /**
     * Method returns value of size. Like a getter.
     *
     * @return value of size
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
        for (int i = 0; i < source.length; i++)
            source[i] = 0;

        size = 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArrayIntegerList that = (ArrayIntegerList) o;
        return size == that.size &&
                Arrays.equals(source, that.source);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(size);
        result = 31 * result + Arrays.hashCode(source);
        return result;
    }

    @Override
    public String toString() {
        return "ArrayIntegerList{" +
                "size=" + size +
                ", source=" + Arrays.toString(source) +
                '}';
    }
}
