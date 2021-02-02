import java.util.TreeSet;

public class MainComparator {

    public static void main(String[] args) {

        newPerson2();
    }

    static void newPerson2() {

        PersonComparator personComparator1 = new PersonComparator(10);
        PersonComparator personComparator2 = new PersonComparator(1);
        PersonComparator personComparator3 = new PersonComparator(100);
        PersonComparator personComparator4 = new PersonComparator(56);
        PersonComparator personComparator5 = new PersonComparator(32);
        PersonComparator personComparator6 = new PersonComparator(33);
        PersonComparator personComparator7 = new PersonComparator(12);

        TreeSet<PersonComparator> set = new TreeSet<>(new ComparatorForPerson());

        set.add(personComparator1);
        set.add(personComparator2);
        set.add(personComparator3);
        set.add(personComparator4);
        set.add(personComparator5);
        set.add(personComparator6);
        set.add(personComparator7);

        for (Object o : set)
            System.out.println(o);
    }

}
