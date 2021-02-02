import java.util.Comparator;

class ComparePersonComparator implements Comparator<Person> {

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int compare(Person o1, Person o2) {
        return o1.age - o2.age;
    }

}
