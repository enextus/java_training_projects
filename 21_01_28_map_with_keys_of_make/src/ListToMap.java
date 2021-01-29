import java.util.*;

public class ListToMap{

    public HashSet<String> findKeys(List<Auto> list) {

        HashSet<String> keySet = new HashSet<>();

        for (Auto car : list)
            keySet.add(car.make);

        return keySet;
    }

    public List<Auto> createListOfMake(String make, List<Auto> lstOfAutos) {

        List<Auto> res = new ArrayList<>();

        for (Auto car : lstOfAutos) {
            if (car.getMake().equals(make)) {

                // return car;
                // mashina najdena i pishem ee w List
                res.add(car);
            }
        }

        // wozwra4aem List Auto s konkretnoj make
        return res;
    }

    public Map<String, List<Auto>> createMap(List<Auto> lstOfAutos) {

        HashMap<String, List<Auto>> autosMap = new HashMap<>(5);

        HashSet<String> keySet = findKeys(lstOfAutos);

        Iterator<String> it = keySet.iterator();

        while (it.hasNext()) {

            String key = it.next();

            List<Auto> currentAutosList = createListOfMake(key, lstOfAutos);

            // siuda dolzen prihodit List po modeljam
            autosMap.put(key, currentAutosList);

        }

        return autosMap;
    }

}
