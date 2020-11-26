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
    }

    @Test
    void set() {
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