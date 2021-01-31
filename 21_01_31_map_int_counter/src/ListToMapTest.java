import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class ListToMapTest {

    // [1,2,4,2,3,1]-> {{1: 2}, {2: 2}, {3: 1}, {4: 1}}

    private final List<Integer> lstInt = new ArrayList<>();
    
    @Test
    void test_findKeys_size_of_keySet() {

        lstInt.add(1);
        lstInt.add(2);
        lstInt.add(4);
        lstInt.add(2);
        lstInt.add(3);
        lstInt.add(1);
        
        lstInt.add(1);
        assertEquals(1, testMap.findKeys(lstInt).size());

        lstInt.add(1);
        lstInt.add(2);
        assertEquals(2, testMap.findKeys(lstInt).size());

        lstInt.add(1);
        lstInt.add(2);
        lstInt.add(3);
        assertEquals(3, testMap.findKeys(lstInt).size());

        lstInt.add(1);
        lstInt.add(2);
        lstInt.add(3);
        lstInt.add(car_4);
        assertEquals(3, testMap.findKeys(lstInt).size());

        lstInt.add(1);
        lstInt.add(2);
        lstInt.add(3);
        lstInt.add(car_4);
        lstInt.add(car_5);
        assertEquals(3, testMap.findKeys(lstInt).size());

        lstInt.add(1);
        lstInt.add(2);
        lstInt.add(3);
        lstInt.add(car_4);
        lstInt.add(car_5);
        lstInt.add(car_6);
        assertEquals(4, testMap.findKeys(lstInt).size());

        lstInt.add(1);
        lstInt.add(2);
        lstInt.add(3);
        lstInt.add(car_4);
        lstInt.add(car_5);
        lstInt.add(car_6);
        lstInt.add(car_7);
        lstInt.add(car_8);
        assertEquals(5, testMap.findKeys(lstInt).size());

        lstInt.add(1);
        lstInt.add(2);
        lstInt.add(3);
        lstInt.add(car_4);
        lstInt.add(car_5);
        lstInt.add(car_6);
        lstInt.add(car_7);
        lstInt.add(car_8);
        lstInt.add(car_9);
        lstInt.add(car_10);
        lstInt.add(car_11);
        assertEquals(6, testMap.findKeys(lstInt).size());
    }


    @Test
    void createMap() {
    }

    @Test
    void findKeys() {
    }

    @Test
    void countFrequency() {
    }
}