public class Main {

    public static void main(String[] args) {

        String strToReverse;

        ReverseString strReverser = new ReverseString();

        strToReverse = "А роза упала на лапу Азора";

        System.out.println("Result: " + strReverser.reverseString(strToReverse.toLowerCase()));
    }

}
