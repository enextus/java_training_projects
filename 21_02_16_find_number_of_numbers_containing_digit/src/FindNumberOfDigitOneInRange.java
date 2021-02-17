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
     * @param initialLeftCorner
     * @param initialRightCorner
     * @return
     */
    public int calcNumberOfOne(int initialLeftCorner, int initialRightCorner) {
        if (initialLeftCorner < 0) {
            int resultOverNegativeNumbers;

            this.setRightRangeCorner(initialRightCorner);
            this.setResult(calcNumbers(getLeftRangeCorner(), Math.abs(initialLeftCorner)));

            resultOverNegativeNumbers = this.calcNumbers(getLeftRangeCorner(), getRightRangeCorner());

            this.setResult(getResult() + resultOverNegativeNumbers);
        } else
            this.setResult(calcNumbers(initialLeftCorner, initialRightCorner));

        return getResult();
    }

    /**
     * There is a range of numbers from a to b inclusive.
     * Find the number of numbers containing the digit 1.
     *
     * @param leftCorner
     * @param rightCorner
     * @return
     */
    public int calcNumbers(int leftCorner, int rightCorner) {
        int count = 0;
        for (int j = leftCorner; j <= rightCorner; j++) {
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
