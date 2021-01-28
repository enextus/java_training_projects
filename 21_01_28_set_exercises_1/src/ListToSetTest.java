
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ListToSetTest {

    ListToSet listToSet = new ListToSet();
    List<Integer> arrayList = Arrays.asList(1, 1, 2, 1);

    @Test
    void Test_listToSet_size() {
        assertEquals(2, listToSet.listToSet(arrayList).size());
    }


    @Test
    void Test_listToSet_NoOrder() {
        Set<Integer> set_1 = listToSet.listToSet(arrayList);
        Set<Integer> set_2 = listToSet.listToSet(arrayList);

        assertEqualsNoOrder(set_1, set_2);
    }
}
