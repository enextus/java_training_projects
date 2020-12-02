public class Main {
    public static void main(String[] args) {
        StringToCode stringToCode = new StringToCode("aaabbcdddd");
        System.out.println(stringToCode.stringCoding());

        StringToCode stringToCodeTwo = new StringToCode("ddfffolllklllpp");
        System.out.println(stringToCodeTwo.stringCoding());

        /*
        aaabbcdddd
        ddfffolllklllpp

        a3b2cd4
        d2f3ol3kl3p2
        */
    }
}
