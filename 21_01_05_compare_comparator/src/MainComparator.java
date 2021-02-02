import java.util.Set;
import java.util.TreeSet;

public class MainComparator {

    public static void main(String[] args) {

        PersonComparable personComparable1 = new PersonComparable(10);
        PersonComparable personComparable2 = new PersonComparable(1);
        PersonComparable personComparable3 = new PersonComparable(100);

        Set set = new TreeSet(new ComparatorForPerson());

        set.add(personComparable1);
        set.add(personComparable2);
        set.add(personComparable3);

        for (Object o : set)
            System.out.println(o);
    }

}
