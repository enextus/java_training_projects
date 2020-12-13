import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OurLinkedListTest {

    @Test
    void test_isEmpty_true() {
        OurLinkedList<Integer> ourLinkedList = new OurLinkedList<>();
        assertTrue(ourLinkedList.isEmpty());
    }

    @Test
    void test_sizeOfEmptyLinkedListIsZero_size() {

        OurLinkedList<Integer> ourLinkedList = new OurLinkedList<>();
        assertEquals(0, ourLinkedList.size());
    }

    @Test
    void test_NullPointerException_after_add_null() {

        OurLinkedList<Integer> ourLinkedList = new OurLinkedList<>();
        assertThrows(NullPointerException.class, () -> ourLinkedList.add(null));
    }

    @Test
    void test_sizeOfLinkedList_after_null_add_size_0() {

        OurLinkedList<Integer> ourLinkedList = new OurLinkedList<>();
        ourLinkedList.add(0);
        assertEquals(1, ourLinkedList.size());
    }

    @Test
    void test_sizeOfLinkedList_after_one_add_size_1() {

        OurLinkedList<Integer> ourLinkedList = new OurLinkedList<>();
        ourLinkedList.add(333);
        assertEquals(1, ourLinkedList.size());
    }

    @Test
    void test_sizeOfLinkedList_after_3_adds_size_3() {

        OurLinkedList<Integer> ourLinkedList = new OurLinkedList<>();
        ourLinkedList.add(1);
        ourLinkedList.add(2);
        ourLinkedList.add(3);
        assertEquals(3, ourLinkedList.size());
    }

    @Test
    void test_sizeOfLinkedList_after_17_adds_size_17() {

        OurLinkedList<Integer> ourLinkedList = new OurLinkedList<>();

        for (int i = 0; i < 17; i++) {
            ourLinkedList.add(i);
        }

        assertEquals(17, ourLinkedList.size());
    }

    @Test
    void test_remove_null_from_empty_list_exception() {

        OurLinkedList<Integer> ourLinkedList = new OurLinkedList<>();
        assertThrows(IllegalStateException.class, () -> ourLinkedList.remove(null));
    }

    @Test
    void test_remove_1_from_empty_list_exception() {

        OurLinkedList<Integer> ourLinkedList = new OurLinkedList<>();
        assertThrows(IllegalStateException.class, () -> ourLinkedList.remove(1));
    }

    @Test
    void test_remove_element_from_list_cont_1_element_true() {

        OurLinkedList<Integer> ourLinkedList = new OurLinkedList<>();
        ourLinkedList.add(1);
        assertTrue(ourLinkedList.remove(1));
    }

    @Test
    void test_remove_element_from_list_a_not_cont_elem_exception() {

        OurLinkedList<Integer> ourLinkedList = new OurLinkedList<>();
        ourLinkedList.add(10);
        assertThrows(NullPointerException.class, () -> ourLinkedList.remove(2));
    }

    @Test
    void test_remove_elements_true() {

        OurLinkedList<Integer> ourLinkedList = new OurLinkedList<>();
        for (int i = 0; i < 17; i++)
            ourLinkedList.add(i);

        for (int i = 0; i < 17; i++)
            assertTrue(ourLinkedList.remove(i));
    }

    @Test
    void test_SizeChange_results() {
        OurLinkedList<Integer> ourLinkedList = new OurLinkedList<>();

        for (int i = 0; i < 5; i++)
            ourLinkedList.add(i);

        assertEquals(5, ourLinkedList.size());
        ourLinkedList.remove(0);
        assertEquals(4, ourLinkedList.size());
    }
}