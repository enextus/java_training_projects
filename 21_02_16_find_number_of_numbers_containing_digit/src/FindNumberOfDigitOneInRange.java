public class FindNumberOfDigitOneInRange {

    private final int leftRangeCorner;
    private int rightRangeCorner;
    private int result;

    public FindNumberOfDigitOneInRange() {
        this.leftRangeCorner = 0;
        this.rightRangeCorner = 0;
    }

    private void setRrC(int rightRangeCorner) {
        this.rightRangeCorner = rightRangeCorner;
    }

    private int getLrC() {
        return leftRangeCorner;
    }

    private int getRrC() {
        return rightRangeCorner;
    }

    private void setRes(int result) {
        this.result = result;
    }

    private int getRes() {
        return result;
    }

    /**
     * There is a range of numbers from a to b inclusive.
     * Find the number of numbers containing the digit 1.
     * The method receive the initial arguments those pict the both corners of the range.
     *
     * @param iLc initial left range corner
     * @param iRc initial right range corner
     * @return return a result
     */
    public int calcNumberOfOne(int iLc, int iRc) {
        if (iLc < 0) {
            int resNegativeNumbers;

            this.setRrC(iRc);
            this.setRes(calcNumbers(getLrC(), Math.abs(iLc)));

            resNegativeNumbers = this.calcNumbers(getLrC(), getRrC());

            this.setRes(getRes() + resNegativeNumbers);
        } else
            this.setRes(calcNumbers(iLc, iRc));

        return getRes();
    }

    /**
     * the method going the range over and count the number of digit "one" of each next range element
     *
     * @param lC left range corner
     * @param rC right range corner
     * @return return a result
     */
    int calcNumbers(int lC, int rC) {
        int count = 0;
        for (int i = lC; i <= rC; i++)
            count += calcDigitsOne(i);

        return count;
    }

    /**
     * the method calculate the number of the digit "one" in the number who was passed in the method as argument
     *
     * @param n number to check
     * @return return a result
     */
    int calcDigitsOne(int n) {

        int numberForSearch = 1;

        int count = 0;
        while (n > 0) {
            if (n % 10 == numberForSearch)
                count++;

            n = n / 10;
        }

        return count;
    }

}
