import java.util.*;

public class ListToMap {

    public Map<Integer, List<Integer>> createMap(List<Integer> lstOfAutos) {
        HashMap<Integer, List<Integer>> carsMap = new HashMap<>(5);
        HashSet<Integer> keySet = findKeys(lstOfAutos);

        Iterator<Integer> it = keySet.iterator();
        while (it.hasNext()) {
            Integer currentKey = it.next();
            List<Integer> currentCarsList = createListOfInts(currentKey, lstOfAutos);
            carsMap.put(currentKey, currentCarsList);
        }

        return carsMap;
    }

    HashSet<Integer> findKeys(List<Integer> list) {
        HashSet<Integer> keySet = new HashSet<>();

        for (Integer elm : list) {
            keySet.add(elm);
        }

        return keySet;
    }

    List<Integer> createListOfInts(Integer integer, List<Integer> integerList) {
        List<Integer> carListOfSpecificMake = new ArrayList<>();

        for (Integer elm : integerList) {
            if (elm.equals(integer))
                carListOfSpecificMake.add(elm);
        }

        return carListOfSpecificMake;
    }

}
