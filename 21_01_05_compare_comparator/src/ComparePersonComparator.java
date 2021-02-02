import java.util.Comparator;

class ComparePersonComparator implements Comparator<PersonComparable> {

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int compare(PersonComparable o1, PersonComparable o2) {
        return o1.age - o2.age;
    }

}
