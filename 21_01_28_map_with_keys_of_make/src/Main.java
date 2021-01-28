import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Auto testAuto1 = new Auto("Opel", "Green");
        Auto testAuto2 = new Auto("BMW", "White");
        Auto testAuto3 = new Auto("Audi", "Red");

        System.out.println("Test-Auto: " + testAuto1);
        System.out.println("Test-Auto: " + testAuto2);
        System.out.println("Test-Auto: " + testAuto3);

        List<Auto> lstAutos = new ArrayList<>();

        lstAutos.add(testAuto1);
        lstAutos.add(testAuto2);
        lstAutos.add(testAuto3);

        System.out.println("Whole list of Autos: " + lstAutos);
    }

}
