import com.sun.source.util.Trees;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Person implements Comparable<Person> {
    public int getAge() {
        return age;
    }

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

class ComparePerson implements Comparator<Person>{

    @Override
    public int compare(Object o1, Object o2) {
        return o1.getAge() - o2.getAge();
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

        for (Object o:set) {
            System.out.println(o);
        }
    }
}