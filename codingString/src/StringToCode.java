public class StringToCode {
    String stringToCode;

    public StringToCode(String stringToCode) {
        this.stringToCode = stringToCode;
    }

    public String getStringToCode() {
        return stringToCode;
    }

    public String codeString() {

        System.out.println(stringToCode.length());

        for (int i = 0; i < stringToCode.length() - 1; i++) {
            // stringToCode += stringToCode.charAt(i);

            System.out.print(stringToCode.charAt(i) + ",  ");

            if ()
        }

        return stringToCode;
    }
}
