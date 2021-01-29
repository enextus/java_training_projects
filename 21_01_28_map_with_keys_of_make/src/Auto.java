import java.util.Objects;

public class Auto {

    private String make;
    private String color;

    public Auto(String make, String color) {
        this.make = make;
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Auto)) return false;
        Auto auto = (Auto) o;
        return getMake().equals(auto.getMake()) && color.equals(auto.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMake(), color);
    }

    @Override
    public String toString() {
        return "Auto{" +
                "make='" + make + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

}
