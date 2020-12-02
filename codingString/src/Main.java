public class Main {
    public static void main(String[] args) {
        StringToCode stringToCode = new StringToCode("aaabbcdddd");

        stringToCode.codeString();
        System.out.println(">>>> " + stringToCode.getResult());
    }
}
