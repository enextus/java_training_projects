import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Auto auto_1 = new Auto("bmw", "white");

        AutoService ats = new AutoService();

        List<Auto> lst = new ArrayList<>();

        lst.add(auto_1);

        System.out.println("lst: " + lst);

        ats.groupByMake(lst);
    }
    
}
