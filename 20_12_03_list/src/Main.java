import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        OurArrayList<String> strings = new OurArrayList<>();

        // down casting
//        ArrayList anotherStrings = (ArrayList) strings;

        strings.addLast("Vasya");
        strings.addLast("Petya");
        strings.addLast("Alisa");

        // non static nested class
        // every instance of ForwardIterator is dependant on an instance of OurArrayList,
        // which is 'strings' in our case
        Iterator<String> iterator = strings.forwardIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();


        // Outer3.Nested3 nestedObj = new Outer3.Nested3(); // экземпляр класса внутренний

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