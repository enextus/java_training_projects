import java.util.ArrayList;
import java.util.List;

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

        for (Auto auto : autos)
            System.out.println(auto.color + " " + auto.make);

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
