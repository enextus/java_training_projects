import java.util.*;

public class ListToMap {

    public Map<String, List<Integer>> createMap(List<Integer> lstOfAutos) {
        HashMap<String, List<Integer>> carsMap = new HashMap<>(5);
        HashSet<String> keySet = findKeys(lstOfAutos);

        Iterator<String> it = keySet.iterator();
        while (it.hasNext()) {
            String currentKey = it.next();
            List<Integer> currentCarsList = createListOfMake(currentKey, lstOfAutos);
            carsMap.put(currentKey, currentCarsList); // here comes List of Cars with specified make
        }

        return carsMap;
    }

    HashSet<String> findKeys(List<Integer> list) {
        HashSet<String> keySet = new HashSet<>();

        for (Integer car : list) {
            keySet.add(car.getMake());
        }

        return keySet;
    }

    List<Integer> createListOfMake(String make, List<Integer> lstOfAutos) {
        List<Integer> carListOfSpecificMake = new ArrayList<>();

        for (Integer car : lstOfAutos) {
            if (car.getMake().equals(make))
                carListOfSpecificMake.add(car); // found car will be added to the List
        }

        return carListOfSpecificMake; // return generated List of Cars with specified make
    }

}
