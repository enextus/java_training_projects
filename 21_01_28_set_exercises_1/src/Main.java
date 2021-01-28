import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> arrayList = Arrays.asList(1, 1, 2, 1);

        System.out.println("Our List: " + arrayList);

        ListToSet listToSet = new ListToSet();

        System.out.println(listToSet.addListToSet(arrayList));

    }
}
