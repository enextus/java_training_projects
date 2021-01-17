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


