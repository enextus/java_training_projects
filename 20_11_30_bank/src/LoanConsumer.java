public class LoanConsumer {

    private final String name;
    private final int age;
    private final int annualIncome;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getAnnualIncome() {
        return annualIncome;
    }

    public LoanConsumer(String name, int age, int annualIncome) {
        this.name = name;
        this.age = age;
        this.annualIncome = annualIncome;
    }

}
