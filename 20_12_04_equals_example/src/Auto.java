import java.util.Objects;

public class Auto {
    String make;
    String color;
    String wheels;

    public Auto(String make, String color) {
        this.make = make;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Auto)) return false;
        Auto auto = (Auto) o;
        return Objects.equals(make, auto.make) && Objects.equals(color, auto.color) && Objects.equals(wheels, auto.wheels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, color, wheels);
    }

}
