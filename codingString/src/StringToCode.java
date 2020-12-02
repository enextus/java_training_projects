public class StringToCode {
    private String inputString;
    private String result;

    public StringToCode(String inputString) {
        this.inputString = inputString;
    }

    public String codeString() {

        String result = "";
        int count = 1;

        System.out.println(inputString.length());

        for (int i = 0; i < inputString.length() - 1; i++) {

            System.out.print("char[i]: " + inputString.charAt(i) + ",  ");

            if ((i > 0) && (inputString.charAt(i - 1) == inputString.charAt(i))) {

                count++;
                System.out.println("count: " + count);

            } else {
                System.out.println("count -> " + count);

                resultBuilder(inputString.charAt(i), count);
                count = 1;
            }

            System.out.println("i: " + i + ", count: " + count + ", 36. result: " + result);
        }

        return result;
    }

    private void resultBuilder(char a, int b) {
        if (b == 1) {
            result += "" + a;
        } else {
            result += "" + a + b;
        }

        System.out.println(result);
    }
}
