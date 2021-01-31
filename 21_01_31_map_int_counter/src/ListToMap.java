import java.util.*;

public class ListToMap {

    public Map<Integer, Integer> createMap(List<Integer> lst) {

        HashMap<Integer, Integer> intsMap = new HashMap<>();
        HashSet<Integer> keySet = findKeys(lst);

        for (Integer key : keySet)
            intsMap.put(key, countFrequency(lst, key));

        return intsMap;
    }

    HashSet<Integer> findKeys(List<Integer> lst) {

        return new HashSet<>(lst);
    }

    Integer countFrequency(List<Integer> lst, Integer currentKey) {

        return Collections.frequency(lst, currentKey);
    }

}
