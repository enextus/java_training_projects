public class Main {

    public static void main(String[] args) {
        // write your code here
        // normalise


    }

    public static float normalise(float inValue, float min, float max) {
        return (inValue - min) / (max - min);
    }


/*    *//**
     * Normalize x.
     * @param x The value to be normalized.
     * @return The result of the normalization.
     *//*
    public double normalize(double x) {
        return ((x - dataLow)
                / (dataHigh - dataLow))
                * (normalizedHigh - normalizedLow) + normalizedLow;
    }*/

}
