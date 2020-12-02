public class StringToCode {
    private final String inputString;
    private String result;

    public StringToCode(String inputString) {
        this.inputString = inputString;
        this.result = "";
    }

    public String stringCoding() {
        int count = 1;

        for (int i = 1; i < inputString.length(); i++) {
            if (inputString.charAt(i - 1) == inputString.charAt(i)) {
                count++;

                if (i == inputString.length() - 1) resultBuilder(inputString.charAt(i - 1), count);
            } else {
                resultBuilder(inputString.charAt(i - 1), count);
                count = 1;
            }
        }
        return result;
    }

    private void resultBuilder(char charName, int lengthOfSeries) {
        if (lengthOfSeries == 1) result += "" + charName;
        else result += "" + charName + lengthOfSeries;
    }
}
