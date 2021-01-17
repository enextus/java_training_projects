import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class OurHashMapTest {
    OurMap<String, Auto> map = new OurHashMap<>();
    OurMap<Integer, Integer> mapInt = new OurHashMap<>();

    Auto opel = new Auto("grey", "Opel");
    Auto mazda = new Auto("red", "Mazda");
    Auto bmw = new Auto("black", "BMW");
    Auto bmw1 = new Auto("black", "BMW");
    Auto audi = new Auto("blue", "Audi");
    Auto audi2 = new Auto("braun", "Audi");

    @Test
    void test_sizeOfEmpty_OurHashMap_IsZero_size() {
        assertEquals(0, map.size());
    }

    @Test
    public void testAssert_OurHashMap_size() {
        map.put("o", opel);
        map.put("m", mazda);
        map.put("b", bmw);
        map.put("a", audi);
        map.put("a2", audi2);

        assertEquals(5, map.size());
    }

    @Test
    void test_NullPointerException_OurHashMap_after_add_null() {
        assertThrows(NullPointerException.class, () -> map.put(null, null));
    }

    @Test
    void test_sizeOfLinkedList_OurHashMap_after_null_add_size_0() {
        mapInt.put(0, 0);
        assertEquals(1, mapInt.size());
    }

    @Test
    void test_sizeOfLinkedList_OurHashMap_after_3_adds_size_3() {
        mapInt.put(1, 1);
        mapInt.put(2, 1);
        mapInt.put(3, 1);
        assertEquals(3, mapInt.size());
    }

    @Test
    void test_sizeOfLinkedList_OurHashMap_after_17_adds_size_17() {
        for (int i = 0; i < 99; i++)
            mapInt.put(i, i);

        assertEquals(99, mapInt.size());
    }

    @Test
    void test_remove_null_from_OurHashMap_empty_list_exception() {
        assertThrows(NullPointerException.class, () -> mapInt.remove(null));
    }

    @Test
    void test_remove_1_from_OurHashMap_empty_list_exception() {
        assertEquals(null, mapInt.remove(1));
    }

    @Test
    void test_remove_element_from_OurHashMap_list_cont_1_element_true() {
        mapInt.put(1, 1);
        assertEquals(1, mapInt.remove(1));

        assertEquals(null, mapInt.remove(1));
    }

    @Test
    void test_remove_element_from_OurHashMap_a_not_cont_elem_exception() {
        mapInt.put(10, 10);
        assertEquals(null, mapInt.remove(1));
    }

    @Test
    void test_OurHashMap_remove_elements_true() {
        for (int i = 0; i < 17; i++)
            mapInt.put(i, i);

        for (int i = 0; i < 17; i++)
            assertEquals(i, mapInt.remove(i));
    }

    @Test
    void test_OurHashMap_SizeChange_results() {
        for (int i = 0; i < 5; i++)
            mapInt.put(i, i);

        assertEquals(5, mapInt.size());

        mapInt.remove(0);
        assertEquals(4, mapInt.size());

        mapInt.remove(1);
        assertEquals(3, mapInt.size());

        mapInt.remove(2);
        assertEquals(2, mapInt.size());

        mapInt.remove(3);
        assertEquals(1, mapInt.size());

        mapInt.remove(4);
        assertEquals(0, mapInt.size());

        mapInt.remove(5);
        assertEquals(0, mapInt.size());

        mapInt.remove(5);
        assertEquals(0, mapInt.size());
    }

    @Test
    void test_OurHashMap_get_more_as_them_size_exception() {
        assertEquals(null, mapInt.get(-2));
        assertEquals(null, mapInt.get(0));
        assertEquals(null, mapInt.get(2));
    }

    @Test
    void test_OurHashMap_get_wrong_index_exception() {
        for (int i = 0; i < 5; i++)
            mapInt.put(i, i);

        assertEquals(null, mapInt.get(5));
        assertEquals(null, mapInt.get(-1));
    }

    @Test
    void test_OurHashMap_get_after_remove_exception() {

        for (int i = 0; i < 5; i++)
            mapInt.put(i, i);

        assertEquals(4, mapInt.get(4));
        assertEquals(0, mapInt.get(0));

        assertEquals(0, mapInt.remove(0));
        assertEquals(null, mapInt.get(0));

        assertEquals(1, mapInt.get(1));
        assertEquals(2, mapInt.get(2));

        assertEquals(2, mapInt.remove(2));
        assertEquals(null, mapInt.get(0));
        assertEquals(1, mapInt.get(1));
        assertEquals(null, mapInt.get(2));

        assertEquals(3, mapInt.get(3));
        assertEquals(4, mapInt.get(4));
    }

    @Test
    void test_OurHashMap_Put_resize() {
        map.put("WIN4528", opel);
        map.put("WIN74528", opel);
        map.put("WIN56828", mazda);
        map.put("WIN56628", mazda);
        map.put("WIN56298", mazda);
        map.put("WIN8988", bmw);
        map.put("WIN8989", bmw);
        map.put("WIN5628", audi);
        map.put("WIN56256", audi2);

        assertEquals(map.get("WIN56256"), audi2);
        assertEquals(map.size(), 9);
        assertEquals(9, map.size());
    }

    @Test
    void change_OurHashMap_TheValueOofAnExistingElement() {
        map.put("WIN5628", audi);
        assertEquals(audi, map.get("WIN5628"));

        map.put("WIN5628", audi2);
        assertEquals(audi2, map.get("WIN5628"));

        assertEquals(map.size(), 1);
    }

    @Test
    void testRemove_OurHashMap_twoObjectInCells_bottom() {
        map.put("WIN4528", opel);
        map.put("WIN74528", opel);

        assertEquals(opel, map.get("WIN74528"));

        map.put("WIN56828", mazda);
        map.put("WIN56628", mazda);

        assertEquals(mazda, map.get("WIN56828"));

        map.put("WIN56298", mazda);
        map.put("WIN8988", bmw);
        map.put("WIN8989", bmw);
        map.put("WIN5628", audi);
        map.put("WIN56256", audi2);

        assertEquals(bmw, map.remove("WIN8989"));
        assertEquals(opel, map.get("WIN74528"));
        assertEquals(8, map.size());
        assertEquals(opel, map.get("WIN74528"));
    }

    @Test
    void testRemove_OurHashMap_OneElement() {
        map.put("WIN4528", opel);
        map.put("WIN74528", opel);
        map.put("WIN56828", mazda);
        map.put("WIN56628", mazda);
        map.put("WIN56298", mazda);

        map.put("WIN8988", bmw);

        map.put("WIN8989", bmw);
        map.put("WIN5628", audi);
        map.put("WIN56256", audi2);

        assertEquals(bmw, map.remove("WIN8988"));
        assertNull(map.get("WIN8988"));
        assertEquals(8, map.size());
    }

    @Test
    void testRemove_OurHashMap_twoObjectInCells_UpElement() {
        map.put("WIN4528", opel);
        map.put("WIN74528", opel);
        map.put("WIN56828", mazda);
        map.put("WIN56628", mazda);
        map.put("WIN56298", mazda);
        map.put("WIN8988", bmw);
        map.put("WIN8989", bmw);
        map.put("WIN5628", audi);
        map.put("WIN56256", audi2);

        assertEquals(opel, map.remove("WIN74528"));
        assertEquals(bmw, map.get("WIN8989"));
        assertEquals(8, map.size());
    }

    @Test
    void put_OurHashMap_changeElement() {
        map.put("WIN4528", opel);
        map.put("WIN8988", bmw);
        map.put("WIN8988", bmw1);

        assertEquals(bmw1, map.get("WIN8988"));
        assertNotSame(bmw, map.get("WIN8988"));


        map.put("WIN74528", opel);
        map.put("WIN56828", mazda);
        map.put("WIN56628", mazda);
        map.put("WIN56298", mazda);
        map.put("WIN5628", audi);
        map.put("WIN5628", audi2);

        assertEquals(audi2, map.get("WIN5628"));
        assertNotSame(audi, map.get("WIN5628"));
        assertEquals(7, map.size());
    }

    @Test
    public void checkAllElements_OurHashMap() {
        map.put("o", opel);
        map.put("m", mazda);
        map.put("b", bmw);
        map.put("a", audi);
        map.put("a2", audi2);

        Iterator<String> iterator = map.keyIterator();

        String key;

        for (int i = 0; i < map.size(); i++) {
            key = iterator.next();
            assertNotNull(map.get(key));
        }
    }

    @Test
    public void testKeyIterator_OurHashMap_emptyList() {
        Iterator<String> iterator = map.keyIterator();

        assertFalse(iterator.hasNext());
        assertThrows(IndexOutOfBoundsException.class, () -> iterator.next());
    }

    @Test
    public void testKeyIterator_OurHashMap_oneElement() {
        map.put("WIN4528", opel);

        Iterator<String> iterator = map.keyIterator();

        int i = 0;
        while (iterator.hasNext()) {
            String key = iterator.next();
            assertEquals("WIN4528", key);
        }

        assertThrows(IndexOutOfBoundsException.class, () -> {
            iterator.next();
        });
    }

    @Test
    public void testForwardIterator_OurHashMap_severalElements() {
        map.put("WIN4528", opel);
        map.put("WIN74528", opel);
        map.put("WIN56828", mazda);
        map.put("WIN56628", mazda);
        map.put("WIN56298", mazda);
        map.put("WIN8988", bmw);
        map.put("WIN8989", bmw);
        map.put("WIN5628", audi);
        map.put("WIN56256", audi2);

        Iterator<String> iterator = map.keyIterator();

        int i = 0;
        while (iterator.hasNext()) {
            i++;
        }

        assertEquals(9, map.size());

        assertThrows(IndexOutOfBoundsException.class, () -> {
            iterator.next();
        });
    }

    @Test
    public void test_OurHashMap_keyIterator() {
        for (int i = 0; i < 10; i++) {
            mapInt.put(i, i);
        }

        Iterator<Integer> iterator = mapInt.keyIterator();

        int[] exp = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        int key;
        int i = 0;
        while (iterator.hasNext()) {
            key = iterator.next();
            assertEquals(exp[i], key);
            assertEquals(exp[i], mapInt.get(key));
            i++;
        }
    }
}
