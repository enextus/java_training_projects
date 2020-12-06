public class Main {

    public static void main(String[] args) {

        Auto opel = new Auto("Opel", "grey");

        System.out.print("07 ");
        System.out.println((opel instanceof Auto));
        System.out.println("09 " + opel.hashCode());

        switchAuto(opel);

        System.out.println("13 " + opel.brand);//Opel
        System.out.println("14 " + opel.color);//Green


        boolean b = new String("2") == new String("2");
        System.out.println(b);
        System.out.println(  );

        Integer v= ((Integer) 21 * 2);

        System.out.println("v.hashCode() " +
                "" +v.hashCode());

    }

    private static Auto switchAuto(Auto auto) {

        System.out.println("17 " + auto.hashCode());

        auto = new Auto("Mazda", "red");

        System.out.println("22 " + auto.hashCode());
        System.out.println();

        System.out.println("27 " + auto.toString());
        System.out.println("28 " + auto.hashCode());

        auto.color = "Green";
        System.out.println("30 " + auto.color);

        auto.color = "purple";
        System.out.println("33 " + auto.color);

        return auto;
    }
}

