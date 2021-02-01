import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AutoService {

    Map<String, List<Auto>> groupByMake(List<Auto> autos) {

        Map<String, List<Auto>> result = new HashMap<>();

        for (Auto auto : autos) {

            // hier wird das List genohmen das für ein bestimmtes Model gemacht wurde
            List<Auto> autosList = result.get(auto.getMake());

            if (autosList == null) {
                autosList = new ArrayList<>();

                // wir benutzen Map um in dem Map die Keys zu erstellen
                // falls das Key bereits existiert - wird nichts passieren
                // es wird kein neuen Key erstellt
                result.put(auto.getMake(), autosList);
            }

            autosList.add(auto);
        }

        return result;
    }

    @Override
    public String toString() {
        return "AutoService{}";
    }

}
