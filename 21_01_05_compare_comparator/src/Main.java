import java.util.Set;
import java.util.TreeSet;

class Main {

    public static void main(String[] args) {

        Person person1 = new Person(10);
        Person person2 = new Person(1);
        Person person3 = new Person(100);

        Set set = new TreeSet(new ComparePerson());

        set.add(person1);
        set.add(person2);
        set.add(person3);

        for (Object o : set)
            System.out.println(o);
    }

}
