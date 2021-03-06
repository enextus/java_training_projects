import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ListToMapTest {

    private final List<Integer> lst = new ArrayList<>();
    private final ListToMap testMap = new ListToMap();

    @Test
    void test_findKeys_size_of_keySet_1() {

        lst.add(1);
        assertEquals(1, testMap.findKeys(lst).size());
    }

    @Test
    void test_findKeys_size_of_keySet_2() {

        lst.add(1);
        lst.add(2);
        assertEquals(2, testMap.findKeys(lst).size());
    }

    @Test
    void test_findKeys_size_of_keySet_4() {

        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        assertEquals(4, testMap.findKeys(lst).size());
    }

    @Test
    void test_findKeys_size_of_keySet_4_() {

        lst.add(1);
        lst.add(2);
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        assertEquals(4, testMap.findKeys(lst).size());
    }

    @Test
    void test_findKeys_size_of_keySet_3_() {

        lst.add(4);
        lst.add(4);
        lst.add(3);
        lst.add(3);
        lst.add(2);
        lst.add(2);
        assertEquals(3, testMap.findKeys(lst).size());
    }

    @Test
    void test_countFrequency_1_1() {

        lst.add(1);
        assertEquals(1, testMap.countFrequency(lst, 1));
    }

    @Test
    void test_countFrequency_2_2() {

        lst.add(1);
        lst.add(2);
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        assertEquals(2, testMap.countFrequency(lst, 2));
    }

    @Test
    void test_countFrequency_4_3() {

        lst.add(4);
        lst.add(4);
        lst.add(3);
        lst.add(3);
        lst.add(4);
        lst.add(2);
        assertEquals(3, testMap.countFrequency(lst, 4));
    }

    @Test
    void test_createMap__size_of_2_2() {

        lst.add(1);
        lst.add(2);
        assertEquals(2, testMap.createMap(lst).size());
    }

    @Test
    void test_createMap__size_of_4_3() {

        lst.add(4);
        lst.add(4);
        lst.add(3);
        lst.add(3);
        lst.add(4);
        lst.add(2);
        assertEquals(3, testMap.createMap(lst).size());
    }

    @Test
    void test_createMap_equals_() {

        // Map format expectation: [1,2,4,2,3,1]-> {{1: 2}, {2: 2}, {3: 1}, {4: 1}}

        HashMap<Integer, Integer> expectedMap = new HashMap<>();
        expectedMap.put(2, 1);
        expectedMap.put(3, 2);
        expectedMap.put(4, 3);

        lst.add(4);
        lst.add(4);
        lst.add(3);
        lst.add(3);
        lst.add(4);
        lst.add(2);
        assertEquals(expectedMap, testMap.createMap(lst));
    }

}
