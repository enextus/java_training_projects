import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ListToSetTest {

    private final ListToSet listToSet = new ListToSet();
    private final List<Integer> arrayList = Arrays.asList(1, 1, 2, 1);

    @Test
    void Test_listToSet_size() {
        assertEquals(2, listToSet.addListToSet(arrayList).size());
    }

    @Test
    void Test_listToSet_Contains() {
        Set<Integer> first = listToSet.addListToSet(arrayList);
        Set<Integer> second = listToSet.addListToSet(arrayList);
        Set<Integer> third = listToSet.addListToSet(arrayList);

        assertTrue(first.containsAll(second));
        assertTrue(first.containsAll(third));

        assertTrue(second.containsAll(first));
        assertTrue(second.containsAll(third));

        assertTrue(third.containsAll(first));
        assertTrue(third.containsAll(second));
    }

}
