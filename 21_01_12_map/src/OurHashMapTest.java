import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class OurHashMapTest {

    @Test
    public void testAssertMap() {

        OurHashMap<String, String> map = new OurHashMap<String, String>();

        map.put("j", "java");
        map.put("c", "c++");
        map.put("p", "python");
        map.put("n", "node");

        OurHashMap<String, String> expected = new OurHashMap<String, String>();
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
}