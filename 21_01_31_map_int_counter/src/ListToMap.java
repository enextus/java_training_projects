import java.util.*;

public class ListToMap {

    public Map<Integer, Integer> createMap(List<Integer> lstInt) {

        HashMap<Integer, Integer> intsMap = new HashMap<>();
        HashSet<Integer> keySet = findKeys(lstInt);

        for (Integer currentKey : keySet)
            intsMap.put(currentKey, countFrequency(lstInt, currentKey));

        return intsMap;
    }

    HashSet<Integer> findKeys(List<Integer> lst) {

        return new HashSet<>(lst);
    }

    Integer countFrequency(List<Integer> lst, Integer currentKey) {

        return Collections.frequency(lst, currentKey);
    }

}
