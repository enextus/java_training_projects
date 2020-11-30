public class LoanIssuer {
    private String name;
    private boolean isLazy;
    private boolean isKind;

    public LoanIssuer(String name, boolean isLazy, boolean isKind) {
        this.name = name;
        this.isLazy = isLazy;
        this.isKind = isKind;
    }

    public boolean isKind() {
        return isKind;
    }

    public boolean toIssue(LoanConsumer other) {
        if ((other.getAge() < 18) || (other.getAnnualIncome() < 20000))
            return false;

        if (this.isLazy)
            return true;

        if (this.isKind && (other.getAge() < 70))
            return true;

        if (this.isLazy && this.isKind() && (other.getAge() < 50))
            return true;

        return false;
    }

    public String printMsg(boolean status, LoanConsumer other) {
        return "Bank employee " + this.name + " issues a loan to " + other.getName() + ".";
    }
}
