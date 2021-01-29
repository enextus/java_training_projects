import java.util.*;

public class ListToMap<K, V> {

    public Map<String, List> createMap(List<Auto> lstOfAutos) {

        // key -> make
        // val -> list of make

        //lstOfAutosTemp =

        HashMap<String, Auto> autosMap = new HashMap<>(5);

        return null;
    }

    private Set<String> findKeys(List<Auto> list) {

        Set<String> keySet = new HashSet<>();

        for (Auto car : list)
            keySet.add(car.make);

        return keySet;
    }

}
