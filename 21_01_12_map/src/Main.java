import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Main {
    static void fillMap(Map<Auto, String> map) {
        Auto greyOpel = new Auto("Grey", "Opel");
        map.put(greyOpel, "Value of grey opel");
    }

    public static void main(String[] args) {
        Map<Auto, String> map = new HashMap<>();
        fillMap(map);

        Auto anotherGreyOpel = new Auto("Grey", "Opel");
        String value = map.get(anotherGreyOpel);
        System.out.println(value);//
    }

}
