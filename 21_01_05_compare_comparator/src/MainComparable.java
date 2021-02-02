import java.util.Set;
import java.util.TreeSet;

public class MainComparable {

    public static void main(String[] args) {

        newPerson();

    }

    static void newPerson() {

        PersonComparable personComparable1 = new PersonComparable(10);
        PersonComparable personComparable2 = new PersonComparable(1);
        PersonComparable personComparable3 = new PersonComparable(100);
        PersonComparable personComparable4 = new PersonComparable(56);
        PersonComparable personComparable5 = new PersonComparable(32);
        PersonComparable personComparable6 = new PersonComparable(33);

        Set<PersonComparable> set = new TreeSet<>();

        set.add(personComparable1);
        set.add(personComparable2);
        set.add(personComparable3);
        set.add(personComparable4);
        set.add(personComparable5);
        set.add(personComparable6);

        for (Object o : set)
            System.out.println(o);
    }

}
