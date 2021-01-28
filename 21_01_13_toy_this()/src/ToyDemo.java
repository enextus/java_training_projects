public class ToyDemo {

    /**
     * Get the current line number.
     *
     * @return int - Current line number.
     */
    public static int getLineNumber() {
        return Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    public static void main(String[] args) {

        Toy toy2 = new Toy();
        System.out.println("toy2: " + toy2 + ", Line: " + getLineNumber());
        System.out.println("\n");

        Toy toy3 = new Toy("Кукла", 34, "Disney");
        System.out.println("toy3: " + toy3 + ", Line: " + getLineNumber());
        System.out.println("\n");

        Toy toy4 = new Toy("Кукла", 34, "Disney", 22);
        System.out.println("toy4: " + toy4 + ", Line: " + getLineNumber());
    }

}
