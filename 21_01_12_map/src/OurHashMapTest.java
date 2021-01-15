import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class OurHashMapTest {

    OurHashMap<Integer, Integer> mapInt = new OurHashMap<>();

    OurHashMap<String, String> map = new OurHashMap<>();
    OurHashMap<String, String> expected = new OurHashMap<>();

    @Test
    public void testAssertMap() {

        map.put("j", "java");
        map.put("c", "c++");
        map.put("p", "python");
        map.put("n", "node");

        expected.put("n", "node");
        expected.put("c", "c++");
        expected.put("j", "java");
        expected.put("p", "python");

        assertEquals(4, map.size());
    }

    @Test
    void test_isEmpty_true() {
        assertTrue(map.isEmpty());
    }

    @Test
    void test_sizeOfEmptyLinkedListIsZero_size() {
        assertEquals(0, map.size());
    }

    @Test
    void test_NullPointerException_after_add_null() {
        assertThrows(NullPointerException.class, () -> map.put(null, null));
    }

    @Test
    void test_sizeOfLinkedList_after_null_add_size_0() {
        mapInt.put(0, 0);
        assertEquals(1, mapInt.size());
    }

    @Test
    void test_sizeOfLinkedList_after_one_add_size_1() {
        mapInt.put(333, 333);
        assertEquals(1, mapInt.size());
    }

    @Test
    void test_sizeOfLinkedList_after_3_adds_size_3() {
        mapInt.put(1, 1);
        mapInt.put(2, 1);
        mapInt.put(3, 1);
        assertEquals(3, mapInt.size());
    }

    @Test
    void test_sizeOfLinkedList_after_17_adds_size_17() {
        for (int i = 0; i < 17; i++)
            mapInt.put(i, i);

        assertEquals(17, mapInt.size());
    }

    @Test
    void test_remove_null_from_empty_list_exception() {
        assertEquals(null, mapInt.remove(null));
    }

    @Test
    void test_remove_1_from_empty_list_exception() {
        assertEquals(null, mapInt.remove(1));
    }

    @Test
    void test_remove_element_from_list_cont_1_element_true() {
        mapInt.put(1, 1);
        assertEquals(1, mapInt.remove(1));
    }

    @Test
    void test_remove_element_from_list_a_not_cont_elem_exception() {
        mapInt.put(10, 10);
        assertEquals(null, mapInt.remove(1));
    }

    @Test
    void test_remove_elements_true() {
        for (int i = 0; i < 17; i++)
            mapInt.put(i, i);

        for (int i = 0; i < 17; i++)
            assertEquals(i, mapInt.remove(i));
    }

    @Test
    void test_SizeChange_results() {
        for (int i = 0; i < 5; i++)
            mapInt.put(i, i);

        assertEquals(5, mapInt.size());
        mapInt.remove(0);
        assertEquals(4, mapInt.size());
    }

    @Test
    void test_get_more_as_them_size_exception() {
        assertEquals(null, mapInt.get(2));
    }

    @Test
    void test_get_wrong_index_exception() {
        for (int i = 0; i < 5; i++)
            mapInt.put(i, i);

        assertEquals(null, mapInt.get(5));
        assertEquals(null, mapInt.get(-1));
    }

    @Test
    void test_get_after_remove_exception() {

        for (int i = 0; i < 5; i++)
            mapInt.put(i, i);

        assertEquals(4, mapInt.get(4));
        assertEquals(0, mapInt.get(0));

        assertEquals(0, mapInt.remove(0));

        assertEquals(null, mapInt.get(0));
        assertEquals(1, mapInt.get(1));
        assertEquals(2, mapInt.get(2));

        assertEquals(2, mapInt.remove(2));

        assertEquals(null, mapInt.get(0));
        assertEquals(1, mapInt.get(1));
        assertEquals(null, mapInt.get(2));

        assertEquals(3, mapInt.get(3));
        assertEquals(4, mapInt.get(4));
    }
}
