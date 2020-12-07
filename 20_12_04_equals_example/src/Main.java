import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    /**
     * Get the current line number.
     *
     * @return int - Current line number.
     */
    public static int getLineNumber() {
        return Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    public static void main(String[] args) {

        List<Auto> autos = createAutos();

        System.out.print(getLineNumber() + ": ");
        System.out.println(autos.hashCode());
        System.out.println(autos.isEmpty());
        System.out.println(getLineNumber() + ": " + autos.size());

        Auto opel = new Auto("Opel", "grey");
        autos.remove(opel);

        for (Auto auto : autos) {
            System.out.println(auto.color + " " + auto.brand);
        }
    }

    @Override
    public String toString() {

        return "Main{}" + getLineNumber() + ": ";
    }

    private static List<Auto> createAutos() {
        List<Auto> result = new ArrayList<>();
        Auto opel = new Auto("Opel", "grey");
        Auto mazda = new Auto("Mazda", "red");
        Auto bmw = new Auto("bmw", "bmwred");
        Auto audi = new Auto("audi", "raudied");
        result.add(opel);
        result.add(mazda);
        result.add(bmw);
        result.add(audi);
        return result;
    }
}

class Auto {
    String brand;
    String color;
    String wheels;

    public Auto(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (!(obj instanceof Auto))
//            return false;
//
//        Auto otherAuto = (Auto) obj;
//        return this.brand.equals(otherAuto.brand)
//                && this.color.equals(otherAuto.color);
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Auto)) return false;
        Auto auto = (Auto) o;
        return Objects.equals(brand, auto.brand) && Objects.equals(color, auto.color) && Objects.equals(wheels, auto.wheels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, color, wheels);
    }
}