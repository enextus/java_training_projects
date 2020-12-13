import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OurLinkedListTest {

    @Test
    void test_sizeOfEmptyLinkedListIsZero_size() {

        OurList<Integer> ourLinkedList = new OurLinkedList<Integer>();
        assertEquals(0, ourLinkedList.size());
    }


    @Test
    void test_sizeOfLinkedList_after_null_add_size_0() {

        OurLinkedList<Integer> ourLinkedList = new OurLinkedList<Integer>();
        ourLinkedList.add(0);
        assertEquals(0, ourLinkedList.size());
    }

    @Test
    void test_sizeOfLinkedList_after_one_add_size_1() {

        OurLinkedList<Integer> ourLinkedList = new OurLinkedList<Integer>();
        ourLinkedList.add(333);
        assertEquals(1, ourLinkedList.size());
    }

    @Test
    void test_sizeOfLinkedList_after_3_adds_size_3() {

        OurLinkedList<Integer> ourLinkedList = new OurLinkedList<Integer>();
        ourLinkedList.add(1);
        ourLinkedList.add(2);
        ourLinkedList.add(3);
        assertEquals(3, ourLinkedList.size());
    }
}
