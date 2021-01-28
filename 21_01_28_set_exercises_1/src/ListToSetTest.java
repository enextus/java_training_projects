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
        Set<Integer> firstIntSet = toSetObj.addToSet(arrList);
        Set<Integer> secondIntSet = toSetObj.addToSet(arrList);
        Set<Integer> thirdIntSet = toSetObj.addToSet(arrList);

        assertTrue(firstIntSet.containsAll(secondIntSet));
        assertTrue(firstIntSet.containsAll(thirdIntSet));

        assertTrue(secondIntSet.containsAll(firstIntSet));
        assertTrue(secondIntSet.containsAll(thirdIntSet));

        assertTrue(thirdIntSet.containsAll(firstIntSet));
        assertTrue(thirdIntSet.containsAll(secondIntSet));
    }

}
