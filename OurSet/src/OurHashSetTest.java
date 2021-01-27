import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class OurHashSetTest {

    @Test
    void sizeTestAfterAddElement() {
        OurSet<Date> hashSet = new OurHashSet<>();

        Date date = new Date();

        hashSet.add(date);
        assertEquals(1, hashSet.size());
    }

    @Test
    void sizeTestAfterAddSameElement() {
        OurSet<Date> hashSet = new OurHashSet<>();

        Date date = new Date();

        hashSet.add(date);
        assertEquals(1, hashSet.size());

        hashSet.add(date);
        assertEquals(1, hashSet.size());
    }

    @Test
    void hashSetCanFailToFindTheSameElementPreviouslyAdded() {
        OurSet<Date> hashSet = new OurHashSet<>();

        Date date = new Date();
        hashSet.add(date);
        date.setTime(123L);

        assertFalse(hashSet.contains(date));
    }

}