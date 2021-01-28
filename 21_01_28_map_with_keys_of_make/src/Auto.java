import java.util.Objects;

public class Auto {

    String make;
    String color;

    public Auto(String make, String color) {
        this.make = make;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Auto)) return false;
        Auto auto = (Auto) o;
        return make.equals(auto.make) && color.equals(auto.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, color);
    }

}
