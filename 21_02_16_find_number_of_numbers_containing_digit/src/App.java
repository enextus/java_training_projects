public class App {
    public static void main(String[] args) {

        FindNumberOfDigitOneInRange calculateNumber = new FindNumberOfDigitOneInRange();

        System.out.println(calculateNumber.getNumberOfNumbers(-11, 11));
        System.out.println(calculateNumber.getNumberOfNumbers(0, 11));

        //calculateNumber.printVisual();
    }

}
