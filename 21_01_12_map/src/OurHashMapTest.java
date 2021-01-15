import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OurHashMapTest {

    OurHashMap<String, String> map = new OurHashMap<>();
    OurHashMap<String, String> expected = new OurHashMap<String, String>();

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
    void size() {
    }

    @Test
    void put() {
    }

    @Test
    void get() {
    }

    @Test
    void test_remove_Pair_() {
    }

    @Test
    void isEmpty() {
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


        assertThrows(NullPointerException.class, () -> map.add(null));
    }

    @Test
    void test_sizeOfLinkedList_after_null_add_size_0() {


        map.put(0);
        assertEquals(1, map.size());
    }

    @Test
    void test_sizeOfLinkedList_after_one_add_size_1() {


        map.put(333);
        assertEquals(1, map.size());
    }

    @Test
    void test_sizeOfLinkedList_after_3_adds_size_3() {


        map.put(1);
        map.put(2);
        map.put(3);
        assertEquals(3, map.size());
    }

    @Test
    void test_sizeOfLinkedList_after_17_adds_size_17() {


        for (int i = 0; i < 17; i++)
            map.put(i);


        assertEquals(17, map.size());
    }

    @Test
    void test_remove_null_from_empty_list_exception() {


        assertThrows(IllegalStateException.class, () -> map.remove(null));
    }

    @Test
    void test_remove_1_from_empty_list_exception() {

        assertThrows(IllegalStateException.class, () -> map.remove(1));
    }

    @Test
    void test_remove_element_from_list_cont_1_element_true() {


        map.put(1);
        assertTrue(map.remove(1));
    }

    @Test
    void test_remove_element_from_list_a_not_cont_elem_exception() {


        map.put(10);
        assertThrows(NullPointerException.class, () -> map.remove(2));
    }

    @Test
    void test_remove_elements_true() {


        for (int i = 0; i < 17; i++)
            map.put(i);

        for (int i = 0; i < 17; i++)
            assertTrue(map.remove(i));
    }

    @Test
    void test_SizeChange_results() {


        for (int i = 0; i < 5; i++)
            map.put(i);

        assertEquals(5, map.size());
        map.remove(0);
        assertEquals(4, map.size());
    }

    @Test
    void test_get_more_as_them_size_exception() {


        assertThrows(IllegalArgumentException.class, () -> map.get(2));
    }

    @Test
    void test_get_wrong_index_exception() {


        for (int i = 0; i < 5; i++)
            map.add(i);

        assertThrows(IllegalArgumentException.class, () -> map.get(5));
        assertThrows(IllegalArgumentException.class, () -> map.get(-1));
    }

    @Test
    void test_get_after_remove_exception() {


        for (int i = 0; i < 5; i++)
            map.put(i);

        assertEquals(4, map.get(4));

        assertEquals(0, map.get(0));
        assertTrue(map.remove(0));

        assertEquals(1, map.get(0));
        assertEquals(2, map.get(1));
        assertEquals(3, map.get(2));

        assertTrue(map.remove(2));

        assertEquals(1, map.get(0));
        assertEquals(3, map.get(1));
        assertEquals(4, map.get(2));

        assertThrows(IllegalArgumentException.class, () -> map.get(3));
        assertThrows(IllegalArgumentException.class, () -> map.get(4));

    }
}
