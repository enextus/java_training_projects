import java.util.*;

public class ListToMap {

    public Map<Integer, Integer> createMap(List<Integer> lstInt) {

        HashMap<Integer, Integer> intsMap = new HashMap<>();
        HashSet<Integer> keySet = findKeys(lstInt);

        for (Integer currentKey : keySet)
            intsMap.put(currentKey, countFrequency(lstInt, currentKey));

        return intsMap;
    }

    Integer countFrequency(List<Integer> lstInt, Integer currentKey) {

        Collections.frequency(lstInt, currentKey);

        return -1;
    }

    HashSet<Integer> findKeys(List<Integer> list) {

        return new HashSet<>(list);
    }

}
