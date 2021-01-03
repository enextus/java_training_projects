import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStackTest {

    MyStack myStack = new MyStack();

    @Test
    public void testRemoveLast_empty_Stack_throwsIOOBE() {
        assertThrows(IndexOutOfBoundsException.class, () -> myStack.getLast());
    }

    @Test
    public void testRemoveLast_not_empty_Stack() {
        myStack.addLast(0);
        assertEquals(0, myStack.getLast());

        myStack.addLast(-1);
        assertEquals(-1, myStack.getLast());

        myStack.addLast(1);
        assertEquals(1, myStack.getLast());
    }

    @Test
    void testSize_empty_Stack() {
        assertEquals(0, myStack.size());
    }

    @Test
    void testSize_not_empty_Stack() {
        myStack.addLast(1);
        assertEquals(1, myStack.size());

        myStack.addLast(1);
        assertEquals(2, myStack.size());

        myStack.addLast(1);
        assertEquals(3, myStack.size());
    }


    @Test
    void getMax() {
    }

    @Test
    public void addLast() {
    }
}