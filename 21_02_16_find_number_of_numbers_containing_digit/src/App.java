public class App {
    public static void main(String[] args) {

        FindNumberOfDigitOneInRange calculateNumber = new FindNumberOfDigitOneInRange();

        System.out.println(calculateNumber.calcNumberOfOne(-11, 11));
        System.out.println("");

        System.out.println(calculateNumber.calcNumberOfOne(0, 11));
        System.out.println("");

        System.out.println(calculateNumber.calcNumberOfOne(-25, 44));
        System.out.println("");

    }

}
