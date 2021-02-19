import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CutTest {

    @Test
    void test_getLeft_min10_min10() {
        assertEquals(-10, new Cut(-10, -7).getLeft());
    }

    @Test
    void getRight() {
        assertEquals(-7, new Cut(-10, -7).getRight());
    }

}
