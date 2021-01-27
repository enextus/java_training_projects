import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Date;
import java.util.List;


import static org.junit.jupiter.api.Assertions.*;

class OurHashSetTest {

    @Test
    public void hashSetCanFailToFindTheSameElementPreviouslyAdded() {
        OurSet<Date> hashSet = new OurHashSet<>();
        Date date = new Date();
        hashSet.add(date);
        date.setTime(123L);
        //Assertions.assertThat(hashSet).contains(date); //should fail

        assertFalse(hashSet.contains(date));
    }

}
