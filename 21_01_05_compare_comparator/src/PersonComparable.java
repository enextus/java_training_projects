public class PersonComparable implements Comparable<PersonComparable> {

    int age;

    public PersonComparable(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }

    @Override
    public int compareTo(PersonComparable other) {
        return this.getAge() - other.getAge();
    }

}
