import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListToSet {
    
    public Set<Integer> listToSet(List<Integer> list) {

        Set<Integer> set = new HashSet<>();

        set.addAll(list);

        return set;
    }

}
