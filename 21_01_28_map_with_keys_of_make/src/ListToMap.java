import java.util.*;

public class ListToMap {

    public Map<String, List<Auto>> createMap(List<Auto> lstOfAutos) {
        HashMap<String, List<Auto>> carsMap = new HashMap<>(5);
        HashSet<String> keySet = findKeys(lstOfAutos);

        Iterator<String> it = keySet.iterator();
        while (it.hasNext()) {
            String currentKey = it.next();
            List<Auto> currentCarsList = createListOfMake(currentKey, lstOfAutos);
            carsMap.put(currentKey, currentCarsList); // here comes List of Cars with specified make
        }

        return carsMap;
    }

    HashSet<String> findKeys(List<Auto> list) {
        HashSet<String> keySet = new HashSet<>();

        for (Auto car : list) {
            keySet.add(car.getMake());
        }

        return keySet;
    }

    List<Auto> createListOfMake(String make, List<Auto> lstOfAutos) {
        List<Auto> carListOfSpecificMake = new ArrayList<>();

        for (Auto car : lstOfAutos) {
            if (car.getMake().equals(make))
                carListOfSpecificMake.add(car); // found car will be added to the List
        }

        return carListOfSpecificMake; // return generated List of Cars with specified make
    }

}
