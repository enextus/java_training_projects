import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListToSet {
    
    public Set<Integer> addListToSet(List<Integer> list) {

        Set<Integer> set = new HashSet<>();

/*        for (int v : list)
            set.add(v);*/

        set.addAll(list);

        return set;
    }

}
