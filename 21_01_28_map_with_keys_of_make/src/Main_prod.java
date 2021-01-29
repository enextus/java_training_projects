import java.util.ArrayList;
import java.util.List;

public class Main_prod {
    public static void main(String[] args) {

        ListToMap lstToMap = new ListToMap();

        Auto testAuto1 = new Auto("Opel", "Green");
        Auto testAuto2 = new Auto("BMW", "White");
        Auto testAuto3 = new Auto("Audi", "Red");
        Auto testAuto4 = new Auto("Audi", "Blue");
        Auto testAuto5 = new Auto("BMW", "Black");

        List<Auto> lstAutos = new ArrayList<>();

        lstAutos.add(testAuto1);
        lstAutos.add(testAuto2);
        lstAutos.add(testAuto3);
        lstAutos.add(testAuto4);
        lstAutos.add(testAuto5);

        System.out.println("autosMap: " + lstToMap.createMap(lstAutos));

    }

}
