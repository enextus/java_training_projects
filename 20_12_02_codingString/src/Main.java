public class Main {
    public static void main(String[] args) {
//        StringToCode stringToCode = new StringToCode("aaabbcdddd");
//        System.out.println(stringToCode.stringCoding());

        StringToCode stringToCodeTwo = new StringToCode("abbbc");
        System.out.println(stringToCodeTwo.stringCoding());
        String alphabet = "";
        for (char character = 'a'; character <= 'z'; character++) {
            alphabet += character;
            System.out.print(character);

        }

        System.out.println();
        System.out.print(alphabet);

        /*
        aaabbcdddd
        ddfffolllklllpp

        a3b2cd4
        d2f3ol3kl3p2
        */
    }
}
