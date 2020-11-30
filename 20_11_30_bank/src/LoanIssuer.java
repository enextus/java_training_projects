public class LoanIssuer {
    private String name;
    private boolean isLazy;
    private boolean isKind;

    public LoanIssuer(String name, boolean isLazy, boolean isKind) {
        this.name = name;
        this.isLazy = isLazy;
        this.isKind = isKind;
    }

    public String getName() {
        return name;
    }

    public boolean isLazy() {
        return isLazy;
    }

    public boolean isKind() {
        return isKind;
    }

    /**
     * Method accept an object of LoanConsumer and returned boolean.
     *
     * @param loanConsumer1
     * @return
     */
    public boolean toIssue(LoanConsumer loanConsumer1) {
//      bla bla bla
        return false;
    }
}
