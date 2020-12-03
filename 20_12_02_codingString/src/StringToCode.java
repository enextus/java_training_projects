public class StringToCode {
    private final String inputString;
    private String result;

    public StringToCode(String inputString) {
        this.inputString = inputString;
        this.result = "";
    }

    /**
     * Method returned coded variable inputString; inputString has min length of two characters; Code it's as this rule: it will be counted the length of series
     * of similar characters and after initial character will placed a count number of each series length.
     *
     * @return result
     */
    public String stringCoding() {
        int count = 1;

        for (int i = 1; i < inputString.length(); i++) {
            if (inputString.charAt(i - 1) == inputString.charAt(i)) {
                count++;

                if (i == inputString.length() - 1)
                    resultBuilder(inputString.charAt(i - 1), count);

            } else {
                resultBuilder(inputString.charAt(i - 1), count);
                count = 1;

                if (i == inputString.length() - 1)
                    resultBuilder(inputString.charAt(i), count);
            }
        }

        return result;
    }

    private void resultBuilder(char charName, int lengthOfSeries) {

        System.out.println("lengthOfSeries: " + lengthOfSeries);

        if (lengthOfSeries == 1) result += "" + charName;
        else result += "" + charName + lengthOfSeries;
    }
}
