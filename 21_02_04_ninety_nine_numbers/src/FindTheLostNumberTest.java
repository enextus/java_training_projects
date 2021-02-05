import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindTheLostNumberTest {

    private final FindTheLostNumber findTheLostNumber = new FindTheLostNumber();

    @Test
    void test_generateTheList_size() {
        assertEquals(99, findTheLostNumber.generateTheList().size());
    }

}
