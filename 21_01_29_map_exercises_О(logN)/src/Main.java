import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Auto auto_1 = new Auto("bmw", "white");
        Auto auto_2 = new Auto("opel", "green");
        Auto auto_3 = new Auto("opel", "red");

        AutoService ats = new AutoService();

        List<Auto> lst = new ArrayList<>();

        lst.add(auto_1);
        lst.add(auto_2);
        lst.add(auto_3);

        System.out.println("0. List<Auto> autos (Main) ---> " + lst);

        System.out.println("Map result: " + ats.groupByMake(lst));
    }

}
