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

        Auto anotherGreyOpel = new Auto("Lila", "Opel");
        Auto anotherOpel2 = new Auto("Red", "Opel");
        Auto anotherOpel3 = new Auto("Black1", "Audi");
        Auto anotherOpel4 = new Auto("Black2", "Audi");
        Auto anotherOpel5 = new Auto("Black3", "Audi");
        Auto anotherOpel6 = new Auto("Black4", "Audi");
        Auto anotherOpel7 = new Auto("Black5", "Audi");
        Auto anotherOpel8 = new Auto("Black6", "Audi");
        Auto anotherOpel9 = new Auto("Black7", "Audi");

        map.put(anotherGreyOpel, "1. Value of anotherGreyOpel");
        map.put(anotherOpel2, "2. Value of anotherOpel2");
        map.put(anotherOpel3, "3. Value of anotherOpel3");
        map.put(anotherOpel3, "4. Value of anotherOpel3333");

        map.put(anotherOpel5, "5. Value of anotherOpel3");
        map.put(anotherOpel6, "6. Value of anotherOpel3");
        map.put(anotherOpel7, "7. Value of anotherOpel3");
        map.put(anotherOpel8, "8. Value of anotherOpel3");
        map.put(anotherOpel9, "9. Value of anotherOpel3");

        String value = map.get(anotherGreyOpel);
        String value1 = map.get(anotherOpel2);
        String value2 = map.get(anotherOpel3);

        System.out.println("value: " + value);
        System.out.println("value: " + value1);
        System.out.println("value: " + value2);

        System.out.println("map: " + map);
        System.out.println("map.size: " + map.size());
        System.out.println();


/*        for (Map.Entry<Auto, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "/" + entry.getValue());
        }*/
    }
}
