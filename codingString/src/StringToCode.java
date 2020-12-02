public class StringToCode {
    private String inputString;
    private String result;

    public StringToCode(String inputString) {
        this.inputString = inputString;
        this.result = "";
    }

    public String stringCoding() {

        int count = 1;

        for (int i = 1; i < inputString.length(); i++) {

            if (inputString.charAt(i - 1) == inputString.charAt(i)) {
//                System.out.println("IF char[" + i + "]: " + inputString.charAt(i));
                count++;
/*                System.out.println("count by match: " + count);
                System.out.println();*/

                if (i == inputString.length() - 1) resultBuilder(inputString.charAt(i - 1), count);

            } else {
/*                System.out.println("ELSE char[" + i + "]: " + inputString.charAt(i));
                System.out.println("count before resultBuilder: " + count);*/

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
