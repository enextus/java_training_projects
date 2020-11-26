import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
/*        List<Integer> list = new ArrayList<>();

        System.out.println("list.size(): " + list.size());
        if (list.size() != 0) System.out.println("list.get(0): " + list.get(0));
        else System.out.println("null");

        System.out.println("After try");*/

        ArrayIntegerList listTwo = new ArrayIntegerList();
        System.out.println("0 listTwo.size(): " + listTwo.size());

        listTwo.addLast(25);
        listTwo.addLast(100);
        System.out.println(listTwo.get(0));
        System.out.println(listTwo.get(1));

        System.out.println("1 listTwo.size(): " + listTwo.size());
        listTwo.set(1, 10);
        System.out.println("2 listTwo.size(): " + listTwo.size());

        listTwo.set(1, 66);
        System.out.println("3 listTwo.size(): " + listTwo.size());
    }
}