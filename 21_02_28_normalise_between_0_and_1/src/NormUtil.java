public class NormUtil {

    private final double dataLow;
    private final double normalizedHigh;
    private final double dataHigh;
    private final double normalizedLow;

    /**
     * Construct the normalization utility, allow the normalization range to be specified.
     *
     * @param dataHigh The high value for the input data.
     * @param dataLow  The low value for the input data.
     * @param dataHigh The high value for the normalized data.
     * @param dataLow  The low value for the normalized data.
     */
    public NormUtil(double dataHigh, double dataLow, double normalizedHigh, double normalizedLow) {
        this.dataHigh = dataHigh;
        this.dataLow = dataLow;
        this.normalizedHigh = normalizedHigh;
        this.normalizedLow = normalizedLow;
    }

    /**
     * Normalize x.
     *
     * @param x The value to be normalized.
     * @return The result of the normalization.
     */
    public double normalize(double x) {
        return ((x - this.dataLow)
                / (this.dataHigh - this.dataLow))
                * (this.normalizedHigh - this.normalizedLow) + this.normalizedLow;
    }

}
