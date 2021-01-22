import java.util.Objects;

public class Auto {

        private final String make;
        private final String color;

        public Auto(String make, String color) {
            this.make = make;
            this.color = color;
        }

    @Override
    public String toString() {
        return "Auto{" +
                "make='" + make + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Auto)) return false;
            Auto auto = (Auto) o;
            return Objects.equals(make, auto.make) &&
                    Objects.equals(color, auto.color);
        }

        @Override
        public int hashCode() {
            return Objects.hash(make, color);
        }
    }