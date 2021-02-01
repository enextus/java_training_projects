import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AutoService {

    @Override
    public String toString() {
        return "AutoService{}";
    }

    Map<String, List<Auto>> groupByMake(List<Auto> autos) {

        Map<String, List<Auto>> result = new HashMap<>();

        for (Auto auto : autos) {

            List<Auto> autosList = result.get(auto.getMake());

            System.out.println(result.get(auto.getMake()));
            System.out.println(autosList);

            if (autosList == null) {
                autosList = new ArrayList<>();

                // wir benutzen Map um in dem Map die Keys zu erstellen
                // falls das Key bereits existiert - wird nichts passieren
                // es wird kein neuen Key erstellt
                result.put(auto.getMake(), autosList);
            }

            System.out.println("1. ->>>" + autosList);

            autosList.add(auto);

            System.out.println("2. ->>>" + autosList);
            System.out.println("\n");
        }

        return result;
    }

}
