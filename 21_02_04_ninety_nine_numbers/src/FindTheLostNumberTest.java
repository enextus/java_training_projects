import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindTheLostNumberTest {

    private final FindTheLostNumber findTheLostNumber = new FindTheLostNumber();

    @Test
    void test_generateTheList_size() {
        assertEquals(99, findTheLostNumber.generateTheList().size());
    }

    @Test
    void test_generateAHundredNumbers_size() {
        assertEquals(100, findTheLostNumber.generateAHundredNumbers().size());
    }

    @Test
    void test_findTheLostNumber_size() {
        Set<Integer> set = findTheLostNumber.generateAHundredNumbers();
        List<Integer> lst = findTheLostNumber.generateTheList();

        assertEquals(1, findTheLostNumber.findTheLostNumber().size());
    }


}
