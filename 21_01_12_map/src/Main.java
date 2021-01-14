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



        map.put(anotherGreyOpel, "Value of anotherGreyOpel");
        map.put(anotherOpel2, "Value of anotherOpel2");
        map.put(anotherOpel3, "Value of anotherOpel3");

        map.put(anotherOpel3, "Value of anotherOpel3333");

        String value = map.get(anotherGreyOpel);
        String value1 = map.get(anotherOpel2);
        String value2 = map.get(anotherOpel3);

        System.out.println("value: " + value);
        System.out.println("value: " + value1);
        System.out.println("value: " + value2);

        System.out.println("map: " + map);
        System.out.println("map.size: " + map.size());
        System.out.println();


        for (Map.Entry<Auto, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "/" + entry.getValue());
        }
    }
}
