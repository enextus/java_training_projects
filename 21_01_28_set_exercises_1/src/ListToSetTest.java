
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ListToSetTest {

    ListToSet listToSet = new ListToSet();
    List<Integer> arrayList = Arrays.asList(1, 1, 2, 1);

    @Test
    void Test_listToSet_size() {
        assertEquals(2, listToSet.listToSet(arrayList).size());
    }
}
