public class FindNumberOfDigitOneInRange {

    private final int leftRangeCorner;
    private int rightRangeCorner;
    private int result;

    public FindNumberOfDigitOneInRange() {
        this.leftRangeCorner = 0;
        this.rightRangeCorner = 0;
    }

    private void setRightRangeCorner(int rightRangeCorner) {
        this.rightRangeCorner = rightRangeCorner;
    }

    private int getResult() {
        return result;
    }

    private int getLeftRangeCorner() {
        return leftRangeCorner;
    }

    private int getRightRangeCorner() {
        return rightRangeCorner;
    }

    public void setResult(int result) {
        this.result = result;
    }

    /**
     * There is a range of numbers from a to b inclusive.
     * Find the number of numbers containing the digit 1.
     *
     * @param initLC
     * @param initRC
     * @return
     */
    public int calcNumberOfOne(int initLC, int initRC) {
        if (initLC < 0) {
            int resOverNegativeNumbers;

            this.setRightRangeCorner(initRC);
            this.setResult(calcNumbers(getLeftRangeCorner(), Math.abs(initLC)));

            resOverNegativeNumbers = this.calcNumbers(getLeftRangeCorner(), getRightRangeCorner());

            this.setResult(getResult() + resOverNegativeNumbers);
        } else
            this.setResult(calcNumbers(initLC, initRC));

        return getResult();
    }

    /**
     * There is a range of numbers from a to b inclusive.
     * Find the number of numbers containing the digit 1.
     *
     * @param lC
     * @param rC
     * @return
     */
    public int calcNumbers(int lC, int rC) {
        int count = 0;
        int j = lC;
        for (; j <= rC; j++) {
            count += calcDigitsOne(j);
        }

        return count;
    }

    /**
     * There is a range of numbers from a to b inclusive.
     * Find the number of numbers containing the digit 1.
     *
     * @param n
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
