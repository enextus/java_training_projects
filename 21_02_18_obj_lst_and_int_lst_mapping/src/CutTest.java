import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CutTest {

    List<Cut> lstCut = Arrays.asList(
            new Cut(-100, -90),
            new Cut(-5, 5),
            new Cut(40, 80)
    );

    @Test
    void test_getLeft_min10_min10() {
        assertEquals(-10, new Cut(-10, -7).getLeft());
    }

    @Test
    void test_getRight_min7_min7() {
        assertEquals(-7, new Cut(-10, -7).getRight());
    }

    @Test
    void test_getLeft_0_0() {
        assertEquals(0, new Cut(0, 0).getLeft());
    }

    @Test
    void test_getRight_0_0() {
        assertEquals(0, new Cut(0, 0).getLeft());
    }

    @Test
    void test_lstCut_size() {
        assertEquals(3, lstCut.size());
    }

}
