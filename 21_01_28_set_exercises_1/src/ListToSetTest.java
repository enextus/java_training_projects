import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ListToSetTest {

    private final ListToSet toSetObj = new ListToSet();
    private final List<Integer> arrList = Arrays.asList(1, 1, 2, 1);

    @Test
    void Test_listToSet_size() {
        assertEquals(2, toSetObj.addToSet(arrList).size());
    }

    @Test
    void Test_listToSet_Contains() {
        Set<Integer> firstSet = toSetObj.addToSet(arrList);
        Set<Integer> secondSet = toSetObj.addToSet(arrList);
        Set<Integer> thirdSet = toSetObj.addToSet(arrList);

        assertTrue(firstSet.containsAll(secondSet));
        assertTrue(firstSet.containsAll(thirdSet));

        assertTrue(secondSet.containsAll(firstSet));
        assertTrue(secondSet.containsAll(thirdSet));

        assertTrue(thirdSet.containsAll(firstSet));
        assertTrue(thirdSet.containsAll(secondSet));
    }

}
