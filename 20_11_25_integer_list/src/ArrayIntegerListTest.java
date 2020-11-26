import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayIntegerListTest {

    ArrayIntegerList list = new ArrayIntegerList();

    @Test
    void addLast() {
    }

    @Test
    void testGet_() {
        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.get(0);
        });

        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.get(1);
        });

        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.get(100);
        });

        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.get(-1);
        });
    }

    @Test
    void testSet_() {
        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.set(0, 1);
        });

        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.set(0, -4);
        });

        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.set(1, 1);
        });

        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.set(1, -4);
        });
    }

    @Test
    void removeById() {
    }

    @Test
    void size() {
    }

    @Test
    void clear() {
    }
}