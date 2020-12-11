import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        OurArrayList<String> strings = new OurArrayList<>();

        OurArrayList<Integer> integers = new OurArrayList<>();

        // down casting
//        ArrayList anotherStrings = (ArrayList) strings;

        strings.addLast("Vasya");
        strings.addLast("Petya");
        strings.addLast("Alisa");

        System.out.println(integers.size());
        integers.addLast(112);
        integers.addLast(456);
        integers.addLast(989);
        integers.addLast(9389);

        System.out.println(integers.size());
        System.out.println(integers.get(0));
        System.out.println(integers.get(1));
        integers.set(0, 343);

        System.out.println(integers.size());
        System.out.println(integers.get(0));
        System.out.println(integers.get(1));
        System.out.println();
        System.out.println(integers.remove(456));

        System.out.println(integers.size());
        System.out.println(integers.get(0));
        System.out.println(integers.get(1));
        System.out.println();
        System.out.println(integers.contains(989));
        System.out.println(integers.contains(345345));


        System.out.println(integers.size());
        System.out.println(integers.get(0));
        System.out.println(integers.get(1));
        System.out.println();

        // non static nested class
        // every instance of ForwardIterator is dependant on an instance of OurArrayList,
        // which is 'strings' in our case
        Iterator<String> iterator = strings.forwardIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();


        String[] arr = new String[0];

        // Outer3.Nested3 nestedObj = new Outer3.Nested3(); // экземпляр класса внутренний
        // OurArrayList<String>.BackwardIterator<O> nestedObj = new OurArrayList<String>.BackwardIterator<O>(); // экземпляр класса внутренний
        // OurArrayList<Type>.BackwardIterator<O> privateMemberNested = new OurArrayList<Type>.BackwardIterator<>(arr, 5);

        // static nested class
        iterator = strings.backwardIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        String res = "";

        for (int i = 0; i < strings.size(); i++) {
            res += strings.get(i);
        }
    }
}