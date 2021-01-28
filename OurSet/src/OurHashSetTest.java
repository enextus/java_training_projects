import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class OurHashSetTest {

    @Test
    void hashSet_Test_Size_After_Add_One_Element() {
        OurSet<Date> hashSet = new OurHashSet<>();

        Date date = new Date();

        hashSet.add(date);
        assertEquals(1, hashSet.size());
    }

    @Test
    void hashSet_Test_Size_After_Add_Several_Elements() {
        OurSet<Date> hashSet = new OurHashSet<>();

        Date date = new Date();

        hashSet.add(date);
        assertEquals(1, hashSet.size());

        hashSet.add(date);
        assertEquals(1, hashSet.size());
    }

    @Test
    void hashSet_Test_Can_Fail_To_Find_TheSame_Element_Previously_Added() {
        OurSet<Date> hashSet = new OurHashSet<>();

        Date date = new Date();
        hashSet.add(date);
        date.setTime(123L);

        assertFalse(hashSet.contains(date));
    }


    private static final int LIST_SIZE = 100;

    public static class RandomUtils {

        private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz1234567890";

        public static final int MIN_STRING_LENGTH = 10;
        public static final int MAX_STRING_LENGTH = 20;

        public static String createString(int length) {

            Random rnd = new Random();
            StringBuilder sb = new StringBuilder(length);

            for (int i = 0; i < length; ++i)
                sb.append(ALPHABET.charAt(rnd.nextInt(ALPHABET.length())));

            return sb.toString();
        }

        public static List<String> createStringList(int size) {

            Random rnd = new Random();
            List<String> result = new ArrayList<>(size);

            for (int i = 0; i < size; ++i)
                result.add(createString(MIN_STRING_LENGTH + rnd.nextInt(MAX_STRING_LENGTH - MIN_STRING_LENGTH + 1)));

            return result;
        }
    }

    @Test
    public void hashSet_Test_Add() {
        List<String> order1 = RandomUtils.createStringList(LIST_SIZE);
        List<String> order2 = new ArrayList<>(order1);

        Collections.shuffle(order2);

        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        for (String item : order1)
            set1.add(item);

        for (String item : order2)
            set2.add(item);

        List<String> list1 = new ArrayList<>(set1);
        List<String> list2 = new ArrayList<>(set2);

        assertNotEquals(list1, list2);
    }

    @Test
    public void hashSet_Test_AddAll() {
        List<String> order1 = RandomUtils.createStringList(LIST_SIZE);
        List<String> order2 = new ArrayList<>(order1);

        Collections.shuffle(order2);

        OurSet<String> set1 = new OurHashSet<>();
        OurSet<String> set2 = new OurHashSet<>();

        set1.addAll(order1);
        set2.addAll(order2);

        List<String> list1 = new ArrayList<String>(set1);
        List<String> list2 = new ArrayList<String>(set2);

        assertNotEquals(list1, list2);
    }
}
