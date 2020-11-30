public class LoanIssuer {
    private final String name;
    private final boolean isLazy;
    private final boolean isKind;

    public LoanIssuer(String name, boolean isLazy, boolean isKind) {
        this.name = name;
        this.isLazy = isLazy;
        this.isKind = isKind;
    }

    public boolean isKind() {
        return isKind;
    }

    /**
     * Method receive an object of class LoanConsumer and returned a boolean.
     *
     * @param other
     * @return
     */
    public boolean toIssue(LoanConsumer other) {
        int ANNUALMINIMUM = 20000;

        if ((other.getAge() < 18) || (other.getAnnualIncome() < ANNUALMINIMUM))
            return false;

        if (this.isLazy)
            return true;

        if (this.isKind && (other.getAge() < 70))
            return true;

        if (this.isKind() && (other.getAge() < 50))
            return true;

        return false;
    }

    public String printMsg(boolean status, LoanConsumer other) {
        if (status) return "Bank employee " + this.name + " allowed a loan to " + other.getName() + ".";

        return "Bank employee " + this.name + " declined a loan to " + other.getName() + ".";
    }
}
