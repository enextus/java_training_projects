import java.util.*;

public class ListToMap {

    public Map<Integer, Integer> createMap(List<Integer> lstInt) {

        HashMap<Integer, Integer> intsMap = new HashMap<>(4);
        HashSet<Integer> keySet = findKeys(lstInt);

        Iterator<Integer> it = keySet.iterator();

        while (it.hasNext()) {
            Integer currentKey = it.next();

            intsMap.put(currentKey, Collections.frequency(lstInt, currentKey));
        }

        return intsMap;
    }

    HashSet<Integer> findKeys(List<Integer> list) {

        return new HashSet<>(list);
    }

}
