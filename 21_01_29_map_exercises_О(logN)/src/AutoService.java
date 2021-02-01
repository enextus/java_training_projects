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

        System.out.println("result: " + result);

        System.out.println("______________________________________");

        for (Auto auto : autos) {
            List<Auto> autosList = result.get(auto.getMake());

            if (autosList == null) {
                autosList = new ArrayList<>();
                result.put(auto.getMake(), autosList);
            }

            autosList.add(auto);
        }

        return result;
    }

}
