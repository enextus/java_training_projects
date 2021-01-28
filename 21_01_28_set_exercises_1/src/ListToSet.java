import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListToSet {
    
    public Set<Integer> addToSet(List<Integer> list) {

        Set<Integer> intSet = new HashSet<>();

        // for (int v : list) set.add(v);
        intSet.addAll(list);

        return intSet;
    }

}
