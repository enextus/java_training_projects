public class App {
    public static void main(String[] args) {

        FindNumberOfDigitOneInRange calculateNumber = new FindNumberOfDigitOneInRange();

        System.out.println(calculateNumber.startNumberOfNumbers(-11, 11));
        System.out.println(calculateNumber.startNumberOfNumbers(0, 11));

        //calculateNumber.printVisual();
    }

}
