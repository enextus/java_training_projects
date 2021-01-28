import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ListToSetTest {

    private final ListToSet toSetObj = new ListToSet();
    private final List<Integer> arrayList = Arrays.asList(1, 1, 2, 1);

    @Test
    void Test_listToSet_size() {
        assertEquals(2, toSetObj.addToSet(arrayList).size());
    }

    @Test
    void Test_listToSet_Contains() {
        Set<Integer> first = toSetObj.addToSet(arrayList);
        Set<Integer> second = toSetObj.addToSet(arrayList);
        Set<Integer> third = toSetObj.addToSet(arrayList);

        assertTrue(first.containsAll(second));
        assertTrue(first.containsAll(third));

        assertTrue(second.containsAll(first));
        assertTrue(second.containsAll(third));

        assertTrue(third.containsAll(first));
        assertTrue(third.containsAll(second));
    }

}
