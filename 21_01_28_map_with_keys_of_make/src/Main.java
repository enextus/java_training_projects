import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {

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

        System.out.println("Лист объектов класса Auto (make, color):");

        for (Auto car : lstAutos)
            System.out.println(car);

        System.out.println("\n");
        System.out.println("_____________________________________________________________");

        // s pomo4ju Set opredeljaem unikalnye kliu4i -> Opel, BMW, Audi

        // sozdaem Listy po modeljam:



        List<Auto> opel = new ArrayList<>();
        opel.add(testAuto1);

        List<Auto> bmw = new ArrayList<>();
        bmw.add(testAuto2);
        bmw.add(testAuto5);

        List<Auto> audi = new ArrayList<>();
        audi.add(testAuto3);
        audi.add(testAuto4);


        HashMap<String, List> autosMap = new HashMap<>(5) {
            {
                this.put("Opel", opel);
                this.put("BMW", bmw);
                this.put("Audi", audi);
            }
        };

        System.out.println("autosMap: " + autosMap);

    }

}
