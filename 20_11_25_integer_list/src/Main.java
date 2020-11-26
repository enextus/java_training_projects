import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        IntegerList listTwo = new ArrayIntegerList();
        System.out.println("0 listTwo.size(): " + listTwo.size());

        listTwo.addLast(25);
        listTwo.addLast(100);

        System.out.println("1 -> size(): " + listTwo.size());
        listTwo.set(1, 10);
        System.out.println("2 -> size(): " + listTwo.size());

        listTwo.set(1, 66);
        System.out.println("3 -> size(): " + listTwo.size());

        listTwo.set(3, 566);
        System.out.println("4 -> size(): " + listTwo.size());
        listTwo.set(3, 78);
        System.out.println("5 -> size(): " + listTwo.size());

        System.out.println(listTwo.get(2));
        System.out.println(listTwo.get(3));
        System.out.println("remotedValue = " + listTwo.removeById(2));
        System.out.println("6 -> size(): " + listTwo.size());
        System.out.println(listTwo.get(2));
    }
}