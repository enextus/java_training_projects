import java.util.*;

public class ListToMap<K, V> {

    public HashSet<String> findKeys(List<Auto> list) {

        HashSet<String> keySet = new HashSet<>();

        for (Auto car : list)
            keySet.add(car.make);

        return keySet;
    }

    public Auto findMake(String make, List lstOfAutos) {

        for (Auto car : lstOfAutos) {
            if (car.getMake().equals(make)) {
                return car;
            }
        }

        return null;
    }

    public Map<String, List> createMap(List<Auto> lstOfAutos) {

        // key -> make
        // val -> list of make

        HashMap<String, Auto> autosMap = new HashMap<>(5);

        HashSet<String> keySet = findKeys(lstOfAutos);

        Iterator<String> it = keySet.iterator();

        while (it.hasNext()) {

            String key = it.next();

            lstOfAutos.f

            autosMap.put(key, auto);


        }


        return null;
    }


}
