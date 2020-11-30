public class Main {
    public static void main(String[] args) {
        //
        LoanConsumer loanConsumer1 = new LoanConsumer("Mark", 18, 25000);
        LoanConsumer loanConsumer2 = new LoanConsumer("Petr", 50, 30000);

        LoanIssuer loanIssuer1 = new LoanIssuer("Anton", false, false);
        LoanIssuer loanIssuer2 = new LoanIssuer("Stephan", true, false);


        loanIssuer1.toIssue(loanConsumer1);
    }
}
