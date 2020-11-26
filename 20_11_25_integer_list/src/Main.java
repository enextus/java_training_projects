import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        IntegerList listTwo = new ArrayIntegerList();

        System.out.println("list.size(): " + list.size());
        if (list.size() != 0) System.out.println("list.get(0): " + list.get(0));
        else System.out.println("null");

        System.out.println("After try");


        listTwo.addLast(100);
        listTwo.addLast(100);
        listTwo.addLast(100);
        listTwo.addLast(100);

        System.out.println(listTwo.size());

        System.out.println(listTwo.get(0));
        System.out.println(listTwo.get(1));
        System.out.println(listTwo.get(2));
        System.out.println(listTwo.get(3));
        System.out.println(listTwo.get(4));
    }
}