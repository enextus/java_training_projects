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

    public int findNumberOfNumbers(int initialLeftCorner, int initialRightCorner) {

        if (initialLeftCorner < 0) {

            int negativeRes;

            this.setRightRangeCorner(initialRightCorner);
            this.setResult(calcNumberOfNumbers(getLeftRangeCorner(), Math.abs(initialLeftCorner)));

            negativeRes = this.calcNumberOfNumbers(getLeftRangeCorner(), getRightRangeCorner());

            this.setResult(getResult() + negativeRes);

        } else
            this.setResult(calcNumberOfNumbers(initialLeftCorner, initialRightCorner));

        return getResult();
    }

    public int calcNumberOfNumbers(int leftCorner, int rightCorner) {

        int count = 0;
        for (int j = leftCorner; j <= rightCorner; j++) {
            count += countTheNumberOfDigitsOne(j);
        }

        return count;
    }

    int countTheNumberOfDigitsOne(int n) {

        int count = 0;
        while (n > 0) {
            if (n % 10 == 1)
                count++;

            n = n / 10;
        }

        return count;
    }

}
