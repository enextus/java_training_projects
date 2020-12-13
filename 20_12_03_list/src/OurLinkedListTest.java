import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OurLinkedListTest {

    @Test
    void test_sizeOfEmptyLinkedListIsZero_size() {

        OurList<Integer> ourLinkedList = new OurLinkedList<Integer>();

        assertEquals(0, ourLinkedList.size());
    }

    @Test
    void test_sizeOfLinkedList_after_one_add_size() {

        OurLinkedList<Integer> ourLinkedList = new OurLinkedList<Integer>();

        Integer inter = 23;

        ourLinkedList.add(inter);

        System.out.println(ourLinkedList.size());

        assertEquals(1, ourLinkedList.size());
    }
}
