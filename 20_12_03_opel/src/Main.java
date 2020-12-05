public class Main {

    public static void main(String[] args) {

        Auto opel = new Auto("Opel", "grey");
        System.out.println((opel instanceof Auto));

        switchAuto(opel);

        System.out.println(opel.brand);//Opel
        System.out.println(opel.color);//Green
    }

    private static Auto switchAuto(Auto auto) {

        System.out.println("1. " + auto.hashCode());


        auto = new Auto("Mazda", "red");


        System.out.println("2. " + auto.hashCode());


        System.out.println();
        System.out.println(auto.toString());


        auto.color = "Green";
        System.out.println(auto.color);

        auto.color = "purple";
        System.out.println(auto.color);


        return auto;
    }
}

