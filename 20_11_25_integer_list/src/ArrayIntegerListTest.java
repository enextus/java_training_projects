import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayIntegerListTest {

    ArrayIntegerList list = new ArrayIntegerList();

    @Test
    void testAddLast_() {
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
    void testRemoveById_() {
        assertEquals(-911, list.removeById(0));
        assertEquals(-911, list.removeById(-1));
    }

    @Test
    void testSize_() {
        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.set(0, 10);
            assertEquals(1, list.size());
        });
    }

    @Test
    void testClear_() {
    }
}