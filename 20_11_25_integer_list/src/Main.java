import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        System.out.println("list.size(): " + list.size());
        if (list.size() != 0) System.out.println("list.get(0): " + list.get(0));
        else System.out.println("null");

        System.out.println("After try");
    }
}