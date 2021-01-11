import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/*public class Person implements Comparable<Person> {*/
public class Person<Person> {
/*    public int getAge() {
        return age;
    }*/

    int age;

    public Person(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }

/*    @Override
    public int compareTo(Person o) {
        return this.age - o.age;
    }*/
}

class ComparePerson implements Comparator<Person> {

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int compare(Person o1, Person o2) {
        return o1.age - o2.age;
    }
}

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
