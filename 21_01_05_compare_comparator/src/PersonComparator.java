import java.util.Objects;

public class PersonComparator {

    int age;

    public PersonComparator(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "PersonComparator{" +
                "age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PersonComparator)) return false;
        PersonComparator that = (PersonComparator) o;
        return getAge() == that.getAge();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAge());
    }

}
