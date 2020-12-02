public class StringToCode {
    String stringToCode;
    String result;

    public StringToCode(String stringToCode) {
        this.stringToCode = stringToCode;
    }

    public String getStringToCode() {
        return stringToCode;
    }

    public String codeString() {

        String result = "";
        int count = 1;

        System.out.println(stringToCode.length());

        for (int i = 0; i < stringToCode.length() - 1; i++) {

            System.out.print("char[i]: " + stringToCode.charAt(i) + ",  ");

            if ((i > 0) && (stringToCode.charAt(i - 1) == stringToCode.charAt(i))) {

                count++;
                System.out.println("count: " + count);

            } else {
                System.out.println("count -> " + count);

                addToResult(stringToCode.charAt(i), count);
                count = 1;
            }

            System.out.println("i: " + i + ", count: " + count + ", 36. result: " + getResult());
        }

        return getResult();
    }

    public String getResult() {
        return result;
    }

    private void addToResult(char a, int b) {
        if (b == 1) {
            result += "" + a;
        } else {
            result += "" + a + b;
        }

        System.out.println(result);
    }
}
