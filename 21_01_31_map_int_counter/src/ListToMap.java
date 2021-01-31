import java.util.*;

public class ListToMap {

    public Map<Integer, List<Integer>> createMap(List<Integer> lstOfAutos) {
        HashMap<Integer, List<Integer>> carsMap = new HashMap<>(5);
        HashSet<Integer> keySet = findKeys(lstOfAutos);

        Iterator<Integer> it = keySet.iterator();
        while (it.hasNext()) {
            Integer currentKey = it.next();
            List<Integer> currentCarsList = createListOfMake(currentKey, lstOfAutos);
            carsMap.put(currentKey, currentCarsList); // here comes List of Cars with specified make
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

    List<Integer> createListOfMake(Integer make, List<Integer> integerList) {
        List<Integer> carListOfSpecificMake = new ArrayList<>();

        for (Integer elm : integerList) {
            if (elm.equals(make))
                carListOfSpecificMake.add(elm); // found car will be added to the List
        }

        return carListOfSpecificMake; // return generated List of Cars with specified make
    }

}
