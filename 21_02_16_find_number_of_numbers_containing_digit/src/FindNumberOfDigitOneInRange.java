public class FindNumberOfDigitOneInRange {

    private final int leftRangeCorner;
    private int rightRangeCorner;
    private int result;

    public FindNumberOfDigitOneInRange() {
        this.leftRangeCorner = 0;
        this.rightRangeCorner = 0;
    }

    private void setRRC(int rightRangeCorner) {
        this.rightRangeCorner = rightRangeCorner;
    }

    private int getLRC() {
        return leftRangeCorner;
    }

    private int getRRC() {
        return rightRangeCorner;
    }

    public void setRes(int result) {
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
     * @param iLC initial left range corner
     * @param iRC initial right range corner
     * @return
     */
    public int calcNumberOfOne(int iLC, int iRC) {
        if (iLC < 0) {
            int resNegativeNumbers;

            this.setRRC(iRC);
            this.setRes(calcNumbers(getLRC(), Math.abs(iLC)));

            resNegativeNumbers = this.calcNumbers(getLRC(), getRRC());

            this.setRes(getRes() + resNegativeNumbers);
        } else
            this.setRes(calcNumbers(iLC, iRC));

        return getRes();
    }

    /**
     * the method going the range over and count the number of digit "one" of each next range element
     *
     * @param lC left range corner
     * @param rC right range corner
     * @return
     */
    public int calcNumbers(int lC, int rC) {
        int count = 0;
        for (int i = lC; i <= rC; i++)
            count += calcDigitsOne(i);

        return count;
    }

    /**
     * the method calculate the number of the digit "one" in the number who was passed in the method as argument
     *
     * @param n number to check
     * @return
     */
    int calcDigitsOne(int n) {
        int count = 0;
        while (n > 0) {
            if (n % 10 == 1)
                count++;

            n = n / 10;
        }

        return count;
    }

}
