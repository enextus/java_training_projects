import java.util.Comparator;

class ComparatorForPerson implements Comparator<PersonComparator> {
    @Override
    public String toString() {
        return "ComparatorForPerson{}";
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int compare(PersonComparator o1, PersonComparator o2) {
        return o1.age - o2.age;
    }
}
