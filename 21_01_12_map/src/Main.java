import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<Auto, String> map = new HashMap<>();
        fillMap(map);

        // Рекомендуется в качестве ключей для HashMap использовать только те объекты,
        // у которых переопределены hashCode и equals, а также они immutable (не изменяются
        // с момента создания)
        Auto anotherGreyOpel = new Auto("Grey", "Opel");
        String value = map.get(anotherGreyOpel);
        System.out.println(value);//
    }

    static void fillMap(Map<Auto, String> map) {
        Auto greyOpel = new Auto("Grey", "Opel");
        map.put(greyOpel, "Value of grey opel");
    }
}
