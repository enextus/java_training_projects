import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ListToMapTest {

    private final ListToMap testMap = new ListToMap();

    private final Auto car_1 = new Auto("Opel", "Green");
    private final Auto car_2 = new Auto("BMW", "White");
    private final Auto car_3 = new Auto("Audi", "Red");
    private final Auto car_4 = new Auto("Audi", "Blue");
    private final Auto car_5 = new Auto("BMW", "Black");

    private final List<Auto> lstAutos = new ArrayList<>();


    @Test
    void test_findKeys_size_of_keySet() {

        lstAutos.add(car_1);
        lstAutos.add(car_2);
        lstAutos.add(car_3);
        lstAutos.add(car_4);
        lstAutos.add(car_5);

        testMap.findKeys(lstAutos);

        assertEquals(3, testMap.findKeys(lstAutos).size());
    }

    @Test
    void createListOfMake() {
    }

    @Test
    void createMap() {
    }
}