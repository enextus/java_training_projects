import java.util.ArrayList;
import java.util.List;

public class Main_prod {
    public static void main(String[] args) {

        ListToMap lstToMap = new ListToMap();

        Auto car_1 = new Auto("Opel", "Green");
        Auto car_2 = new Auto("BMW", "White");
        Auto car_3 = new Auto("Audi", "Red");
        Auto car_4 = new Auto("Audi", "Blue");
        Auto car_5 = new Auto("BMW", "Black");

        List<Auto> lstAutos = new ArrayList<>();

        lstAutos.add(car_1);
        lstAutos.add(car_2);
        lstAutos.add(car_3);
        lstAutos.add(car_4);
        lstAutos.add(car_5);

        System.out.println("autosMap: " + lstToMap.createMap(lstAutos));

        // autosMap: {
        // Opel=[Auto{make='Opel', color='Green'}],
        // BMW=[Auto{make='BMW', color='White'}, Auto{make='BMW', color='Black'}],
        // Audi=[Auto{make='Audi', color='Red'}, Auto{make='Audi', color='Blue'}]
        // }

    }

}
