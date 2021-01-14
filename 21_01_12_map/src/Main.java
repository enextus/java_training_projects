import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Main {
/*    static void fillMap(Map<Auto, String> map) {
        Auto greyOpel = new Auto("Grey", "Opel");
        map.put(greyOpel, "Value of grey opel");
    }*/

    public static void main(String[] args) {
        Map<Auto, String> map = new HashMap<Auto, String>();


//        fillMap(map);

        Auto anotherGreyOpel = new Auto("Lila", "Opel");
        Auto anotherOpel2 = new Auto("Red", "Opel");
        Auto anotherOpel3 = new Auto("Black", "Audi");

/*        String value = map.get(anotherGreyOpel);
        System.out.println("value: " + value);*/

        map.put(anotherGreyOpel, "Value of anotherGreyOpel");
        map.put(anotherOpel2, "Value of anotherOpel2");
        map.put(anotherOpel3, "Value of anotherOpel3");

        map.put(anotherOpel3, "Value of anotherOpel3333");

        System.out.println("map: " + map);
        System.out.println("map.size: " + map.size());
        System.out.println();


        for (Map.Entry<Auto, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "/" + entry.getValue());
        }
    }
}
