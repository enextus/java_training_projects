public class LoanConsumer {
    private String name;
    private int age;
    private int annualIncome;

    public int getAnnualIncome() {
        return annualIncome;
    }

    public LoanConsumer(String name, int age, int annualIncome) {
        this.name = name;
        this.age = age;
        this.annualIncome = annualIncome;
    }
}
