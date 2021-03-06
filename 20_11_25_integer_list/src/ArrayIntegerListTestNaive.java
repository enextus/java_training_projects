import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayIntegerListTestNaive {

    IntegerList list = new ArrayIntegerList();

    @Test
    void testSize_() {
        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.set(0, 10);
            assertEquals(1, list.size());
        });
    }

    @Test
    void testAddLast_() {
        list.clear();
        list.addLast(-1);
        assertEquals(-1, list.get(0));
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
        list.addLast(100);
        assertEquals(100, list.removeById(0));
        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.removeById(-1);
        });
    }

    @Test
    void testClear_() {
        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.clear();
            list.get(0);
            list.get(-1);
            list.get(110);
        });
    }
}
