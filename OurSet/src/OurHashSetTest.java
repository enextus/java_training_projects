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

}
