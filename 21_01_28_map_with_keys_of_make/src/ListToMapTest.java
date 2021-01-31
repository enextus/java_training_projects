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
    private final Auto car_6 = new Auto("TOYOTA", "Black");
    private final Auto car_7 = new Auto("Ford", "White");
    private final Auto car_8 = new Auto("Ford", "Blue");
    private final Auto car_9 = new Auto("TESLA", "Blue");
    private final Auto car_10 = new Auto("TESLA", "Red");
    private final Auto car_11 = new Auto("TESLA", "Orange");

    private final List<Auto> lstAutos = new ArrayList<>();

    @Test
    void test_findKeys_size_of_keySet() {

        lstAutos.add(car_1);
        assertEquals(1, testMap.findKeys(lstAutos).size());

        lstAutos.add(car_1);
        lstAutos.add(car_2);
        assertEquals(2, testMap.findKeys(lstAutos).size());

        lstAutos.add(car_1);
        lstAutos.add(car_2);
        lstAutos.add(car_3);
        assertEquals(3, testMap.findKeys(lstAutos).size());

        lstAutos.add(car_1);
        lstAutos.add(car_2);
        lstAutos.add(car_3);
        lstAutos.add(car_4);
        assertEquals(3, testMap.findKeys(lstAutos).size());

        lstAutos.add(car_1);
        lstAutos.add(car_2);
        lstAutos.add(car_3);
        lstAutos.add(car_4);
        lstAutos.add(car_5);
        assertEquals(3, testMap.findKeys(lstAutos).size());

        lstAutos.add(car_1);
        lstAutos.add(car_2);
        lstAutos.add(car_3);
        lstAutos.add(car_4);
        lstAutos.add(car_5);
        lstAutos.add(car_6);
        assertEquals(4, testMap.findKeys(lstAutos).size());
    }

    @Test
    void test_createListOfMake_size_of_generated_list() {

        lstAutos.add(car_1);
        lstAutos.add(car_2);
        lstAutos.add(car_3);
        lstAutos.add(car_4);
        lstAutos.add(car_5);

        List<Auto> expected = new ArrayList<>();
        expected.add(car_3);
        expected.add(car_4);

        assertEquals(expected.size(), testMap.createListOfMake("Audi", lstAutos).size());
        assertEquals(expected, testMap.createListOfMake("Audi", lstAutos));
    }

    @Test
    void test_createListOfMake_contains_of_generated_list() {

        lstAutos.add(car_1);
        lstAutos.add(car_2);
        lstAutos.add(car_3);
        lstAutos.add(car_4);
        lstAutos.add(car_5);

        List<Auto> expected = new ArrayList<>();
        expected.add(car_3);
        expected.add(car_4);

        assertEquals(expected, testMap.createListOfMake("Audi", lstAutos));
    }

    @Test
    void test_createMap_size_of_generated_map() {

        // autosMap: {
        // Opel=[Auto{make='Opel', color='Green'}],
        // BMW=[Auto{make='BMW', color='White'}, Auto{make='BMW', color='Black'}],
        // Audi=[Auto{make='Audi', color='Red'}, Auto{make='Audi', color='Blue'}]
        // }

        lstAutos.add(car_1);
        lstAutos.add(car_2);
        assertEquals(2, testMap.createMap(lstAutos).size());

        lstAutos.add(car_1);
        lstAutos.add(car_2);
        lstAutos.add(car_3);
        assertEquals(3, testMap.createMap(lstAutos).size());

        lstAutos.add(car_1);
        lstAutos.add(car_2);
        lstAutos.add(car_3);
        lstAutos.add(car_4);
        lstAutos.add(car_5);
        assertEquals(3, testMap.createMap(lstAutos).size());
    }

}
