import java.util.Comparator;

class ComparatorForPerson implements Comparator<PersonComparator> {

    @Override
    public int compare(PersonComparator o1, PersonComparator o2) {
        return o1.age - o2.age;
    }

}
