import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class OurHashMapTest {

    OurMap<Integer, Integer> mapInt = new OurHashMap<>();
    OurMap<String, Auto> map        = new OurHashMap<>();

    Auto opel   = new Auto("grey", "Opel");
    Auto mazda  = new Auto("red", "Mazda");
    Auto bmw    = new Auto("black", "BMW");
    Auto audi   = new Auto("blue", "Audi");
    Auto audi2  = new Auto("braun", "Audi");

    // String[] autoWin = {"WIN4528", "WIN56828", "WIN56628", "WIN56298", "WIN8988", "WIN8989", "WIN5628", "WIN56256"};

    @Test
    void test_sizeOfEmpty_OurHashMap_IsZero_size() {
        assertEquals(0, map.size());
    }

    @Test
    public void testAssertMap() {
        map.put("o", opel);
        map.put("m", mazda);
        map.put("b", bmw);
        map.put("a", audi);
        map.put("a2", audi2);

        assertEquals(5, map.size());
    }

    @Test
    void test_NullPointerException_after_add_null() {
        assertThrows(NullPointerException.class, () -> map.put(null, null));
    }

    @Test
    void test_sizeOfLinkedList_after_null_add_size_0() {
        mapInt.put(0, 0);
        assertEquals(1, mapInt.size());
    }

    @Test
    void test_sizeOfLinkedList_after_one_add_size_1() {
        mapInt.put(333, 333);
        assertEquals(1, mapInt.size());
    }

    @Test
    void test_sizeOfLinkedList_after_3_adds_size_3() {
        mapInt.put(1, 1);
        mapInt.put(2, 1);
        mapInt.put(3, 1);
        assertEquals(3, mapInt.size());
    }

    @Test
    void test_sizeOfLinkedList_after_17_adds_size_17() {
        for (int i = 0; i < 17; i++)
            mapInt.put(i, i);

        assertEquals(17, mapInt.size());
    }

    @Test
    void test_remove_null_from_empty_list_exception() {
        assertEquals(null, mapInt.remove(null));
    }

    @Test
    void test_remove_1_from_empty_list_exception() {
        assertEquals(null, mapInt.remove(1));
    }

    @Test
    void test_remove_element_from_list_cont_1_element_true() {
        mapInt.put(1, 1);
        assertEquals(1, mapInt.remove(1));
    }

    @Test
    void test_remove_element_from_list_a_not_cont_elem_exception() {
        mapInt.put(10, 10);
        assertEquals(null, mapInt.remove(1));
    }

    @Test
    void test_remove_elements_true() {
        for (int i = 0; i < 17; i++)
            mapInt.put(i, i);

        for (int i = 0; i < 17; i++)
            assertEquals(i, mapInt.remove(i));
    }

    @Test
    void test_SizeChange_results() {
        for (int i = 0; i < 5; i++)
            mapInt.put(i, i);

        assertEquals(5, mapInt.size());
        mapInt.remove(0);
        assertEquals(4, mapInt.size());
    }

    @Test
    void test_get_more_as_them_size_exception() {
        assertEquals(null, mapInt.get(2));
    }

    @Test
    void test_get_wrong_index_exception() {
        for (int i = 0; i < 5; i++)
            mapInt.put(i, i);

        assertEquals(null, mapInt.get(5));
        assertEquals(null, mapInt.get(-1));
    }

    @Test
    void test_get_after_remove_exception() {

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
    void testPut_resize() {
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
    }

    @Test
    void changeTheValueOofAnExistingElement() {

        Auto audi = new Auto("blue", "Audi");
        Auto audi2 = new Auto("braun", "Audi");

        map.put("WIN5628", audi);
        map.put("WIN5628", audi2);
        assertEquals(map.get("WIN5628"), audi2);
        assertNotSame(map.get("WIN5628"), audi);
        assertEquals(map.size(), 1);
    }

    @Test
    void testRemove_twoObjectInCells_bottom() {
        Auto opel = new Auto("grey", "Opel");
        Auto mazda = new Auto("red", "Mazda");
        Auto bmw = new Auto("black", "BMW");
        Auto audi = new Auto("blue", "Audi");
        Auto audi2 = new Auto("braun", "Audi");

        map.put("WIN4528", opel);
        map.put("WIN74528", opel);

        assertEquals(map.get("WIN74528"), opel);

        map.put("WIN56828", mazda);
        map.put("WIN56628", mazda);

        assertEquals(mazda, map.get("WIN56828"));

        map.put("WIN56298", mazda);
        map.put("WIN8988", bmw);
        map.put("WIN8989", bmw);
        map.put("WIN5628", audi);
        map.put("WIN56256", audi2);

        assertEquals(map.remove("WIN8989"), bmw);
        assertEquals(map.get("WIN74528"), opel);
        assertEquals(map.size(), 8);

        assertNull(map.get("WIN74528"));
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

        assertEquals(map.remove("WIN8988"), bmw);
        assertNull(map.get("WIN8988"));
        assertEquals(map.size(), 8);

    }

    @Test
    void testRemove_twoObjectInCells_UpElement() {
        map.put("WIN4528", opel);
        map.put("WIN74528", opel);
        map.put("WIN56828", mazda);
        map.put("WIN56628", mazda);
        map.put("WIN56298", mazda);
        map.put("WIN8988", bmw);
        map.put("WIN8989", bmw);
        map.put("WIN5628", audi);
        map.put("WIN56256", audi2);

        assertEquals(map.remove("WIN74528"), opel);
        assertEquals(map.get("WIN8989"), bmw);
        assertEquals(map.size(), 8);
    }

    @Test
    void put_changeElement() {

        Auto opel = new Auto("grey", "Opel");
        Auto mazda = new Auto("red", "Mazda");
        Auto bmw = new Auto("black", "BMW");
        Auto bmw1 = new Auto("pink", "BMW");
        Auto audi = new Auto("blue", "Audi");
        Auto audi2 = new Auto("braun", "Audi");

        map.put("WIN4528", opel);
        map.put("WIN8988", bmw);
        map.put("WIN8988", bmw1);
        assertEquals(map.get("WIN8988"), bmw1);
        assertNotSame(map.get("WIN8988"), bmw);


        map.put("WIN74528", opel);
        map.put("WIN56828", mazda);
        map.put("WIN56628", mazda);
        map.put("WIN56298", mazda);

        map.put("WIN5628", audi);
        map.put("WIN5628", audi2);
        assertEquals(map.get("WIN5628"), audi2);
        assertNotSame(map.get("WIN5628"), audi);
        assertEquals(map.size(), 7);

        String[] autoWin = {"WIN4528", "WIN56828", "WIN74528", "WIN56628", "WIN56298", "WIN8988", "WIN5628"};
        checkAllElements(map, autoWin);
    }

    void checkAllElements(OurHashMap_naive<String, Auto> mapCheck, String[] arrayStr) {
        for (String elm : arrayStr) {
            // System.out.println(elm);
            assertNotNull(mapCheck.get(elm));
        }
    }

    @Test
    public void testKeyIterator_emptyList() {
        Iterator<String> iterator = map.keyIterator();

        assertFalse(iterator.hasNext());
        assertThrows(IndexOutOfBoundsException.class, () -> {
            iterator.next();
        });
    }

    @Test
    public void testKeyIterator_oneElement() {

        Auto opel = new Auto("grey", "Opel");
        map.put("WIN4528", opel);

        Iterator<String> iterator = map.keyIterator();

        int i = 0;
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(key);
            assertEquals("WIN4528", key);
        }

        assertThrows(IndexOutOfBoundsException.class, () -> {
            iterator.next();
        });
    }

    @Test
    public void testForwardIterator_severalElements() {
        Auto opel = new Auto("grey", "Opel");
        Auto mazda = new Auto("red", "Mazda");
        Auto bmw = new Auto("black", "BMW");
        Auto audi = new Auto("blue", "Audi");
        Auto audi2 = new Auto("braun", "Audi");

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
            System.out.println(iterator.next());
            i++;
        }

        assertEquals(9, map.size());

        assertThrows(IndexOutOfBoundsException.class, () -> {
            iterator.next();
        });
    }

    OurMap<Integer, String> intMap = new OurHashMap_naive<>();

    @Test
    public void test_keyIterator() {
        for (int i = 0; i < 5; i++) {
            intMap.put(i, "aaa");
            intMap.put(i * 2, "bbb");
        }
        Iterator<Integer> iterator = intMap.keyIterator();
        int[] exp = {0, 1, 2, 3, 4, 6, 8};
        int i = 0;
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
//            assertEquals(exp[i++], iterator.next());
        }
    }
}
