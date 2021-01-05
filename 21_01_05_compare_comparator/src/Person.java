import com.sun.source.util.Trees;

import java.util.Set;
import java.util.TreeSet;

public class Person implements Comparable<Person> {

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

    @Override
    public int compareTo(Person o) {
        return this.age - o.age;
    }
}

class Main {
    public static void main(String[] args) {

        Person person1 = new Person(10);
        Person person2 = new Person(1);

        Set set = new TreeSet();

        set.add(person1);
        set.add(person2);

        for (Object o:set
             ) {
            System.out.println(o);
        }
    }
}