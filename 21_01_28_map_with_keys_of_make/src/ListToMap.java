import java.util.*;

public class ListToMap{

    HashSet<String> findKeys(List<Auto> list) {

        HashSet<String> keySet = new HashSet<>();

        for (Auto car : list)
            keySet.add(car.make);

        return keySet;
    }

    List<Auto> createListOfMake(String make, List<Auto> lstOfAutos) {

        List<Auto> res = new ArrayList<>();

        for (Auto car : lstOfAutos) {
            if (car.getMake().equals(make)) {

                // found car will be added to the List
                res.add(car);
            }
        }

        // return generated List of Cars with defined make
        return res;
    }

    public Map<String, List<Auto>> createMap(List<Auto> lstOfAutos) {

        HashMap<String, List<Auto>> autosMap = new HashMap<>(5);
        HashSet<String> keySet = findKeys(lstOfAutos);

        Iterator<String> it = keySet.iterator();

        while (it.hasNext()) {

            String currentKey = it.next();

            List<Auto> currentAutosList = createListOfMake(currentKey, lstOfAutos);

            // here comes List of Cars with defined make
            autosMap.put(currentKey, currentAutosList);
        }

        return autosMap;
    }

}
