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

        Auto opel = new Auto("Opel", "grey");

        System.out.print(getLineNumber() + " ");
        System.out.println((opel instanceof Auto));
        System.out.println(getLineNumber() + " " + opel.hashCode());

        switchAuto(opel);

        System.out.println(getLineNumber() + " " + opel.brand);//Opel
        System.out.println(getLineNumber() + " " + opel.color);//Green
        System.out.println(getLineNumber() + " " + opel.hashCode());
        boolean b = new String("2") == new String("2");
        System.out.println(b);
        System.out.println(  );

        Integer v= ((Integer) 21 * 2);

        System.out.println("v.hashCode() " +
                "" +v.hashCode());
    }

    private static Auto switchAuto(Auto auto) {

        System.out.println(getLineNumber() + " " + auto.hashCode());

        auto = new Auto("Mazda", "red");
        System.out.println(getLineNumber() + " " + auto.hashCode());
        System.out.println();

        System.out.println(getLineNumber() + " " + auto.toString());
        System.out.println(getLineNumber() + " " + auto.hashCode());

        auto.color = "Green";
        System.out.println(getLineNumber() + " " + auto.color);

        auto.color = "purple";
        System.out.println(getLineNumber() + " " + auto.color);
        System.out.println(getLineNumber() + " " + auto.hashCode());
        return auto;
    }
}
