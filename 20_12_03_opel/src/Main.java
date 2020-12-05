public class Main {

    public static void main(String[] args) {

        Auto opel = new Auto("Opel", "grey");
        System.out.println((opel instanceof Auto));

        switchAuto(opel);

        System.out.println(opel.brand);//Opel
        System.out.println(opel.color);//Green
    }

    private static Auto switchAuto(Auto auto) {


        auto.hashCode();

        auto.getClass();

        // (object) instanceof (type)


        System.out.println(auto.toString());


        auto.color = "Green";

        //auto = new Auto("Mazda", "red");
        auto.color = "purple";
        return auto;
    }
}

