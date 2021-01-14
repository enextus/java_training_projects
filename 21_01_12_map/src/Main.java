import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Main {
/*    static void fillMap(Map<Auto, String> map) {
        Auto greyOpel = new Auto("Grey", "Opel");
        map.put(greyOpel, "Value of grey opel");
    }*/

    public static void main(String[] args) {
        OurHashMap<Auto, String> map = new OurHashMap<>();

//        fillMap(map);

        Auto Opel1 = new Auto("Lila", "Opel");
        Auto Opel2 = new Auto("Red", "Opel");
        Auto Opel3 = new Auto("Gray", "Opel");
        Auto Opel4 = new Auto("Gray2", "Opel");
        Auto Opel5 = new Auto("Gray3", "Opel");
        Auto Opel6 = new Auto("Gray4", "Opel");

        map.put(Opel1, "1. Value Opel1");
        map.put(Opel2, "2. Value Opel2");
        map.put(Opel3, "3. Value Opel3");
        map.put(Opel4, "4. Value Opel4");
        map.put(Opel5, "5. Value Opel5");
        map.put(Opel6, "6. Value Opel6");

        System.out.println("map: " + map);
        System.out.println("map.size: " + map.size());
        System.out.println();

        System.out.println("TO REMOVE");

        System.out.println(map.remove(Opel6));

        System.out.println("REMOVED");



        System.out.println("map: " + map);
        System.out.println("map.size: " + map.size());
        System.out.println();



/*        for (Map.Entry<Auto, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "/" + entry.getValue());
        }*/
    }
}
