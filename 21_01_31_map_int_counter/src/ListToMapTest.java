import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ListToMapTest {

    // Expectation: [1,2,4,2,3,1]-> {{1: 2}, {2: 2}, {3: 1}, {4: 1}}

    private final List<Integer> lstInt = new ArrayList<>();
    private final ListToMap testMap = new ListToMap();

    @Test
    void test_findKeys_size_of_keySet_1() {

        lstInt.add(1);
        assertEquals(1, testMap.findKeys(lstInt).size());
    }

    @Test
    void test_findKeys_size_of_keySet_2() {

        lstInt.add(1);
        lstInt.add(2);
        assertEquals(2, testMap.findKeys(lstInt).size());
    }

    @Test
    void test_findKeys_size_of_keySet_4() {

        lstInt.add(1);
        lstInt.add(2);
        lstInt.add(3);
        lstInt.add(4);
        assertEquals(4, testMap.findKeys(lstInt).size());
    }

    @Test
    void test_findKeys_size_of_keySet_4_() {

        lstInt.add(1);
        lstInt.add(2);
        lstInt.add(1);
        lstInt.add(2);
        lstInt.add(3);
        lstInt.add(4);
        assertEquals(4, testMap.findKeys(lstInt).size());
    }

    @Test
    void test_findKeys_size_of_keySet_3_() {

        lstInt.add(4);
        lstInt.add(4);
        lstInt.add(3);
        lstInt.add(3);
        lstInt.add(2);
        lstInt.add(2);
        assertEquals(3, testMap.findKeys(lstInt).size());
    }

    @Test
    void countFrequency() {
    }

    @Test
    void createMap() {
    }

    @Test
    void findKeys() {
    }

}
