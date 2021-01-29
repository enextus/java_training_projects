import java.util.*;

public class ListToMap<K, V> {

    public Map<String, List> createMap(List<Auto> lstOfAutos) {

        // key -> make
        // val -> list of make

        //lstOfAutosTemp =

        HashMap<String, Auto> autosMap = new HashMap<>(5);

        return null;
    }

    public HashSet<String> findKeys(List<Auto> list) {

        HashSet<String> keySet = new HashSet<>();

        for (Auto car : list)
            keySet.add(car.make);

        return keySet;
    }

}
