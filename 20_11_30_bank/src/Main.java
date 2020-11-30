public class Main {
    public static void main(String[] args) {

        LoanConsumer loanConsumer1 = new LoanConsumer("Mark", 18, 25000);
        LoanConsumer loanConsumer2 = new LoanConsumer("Petr", 50, 30000);
        LoanConsumer loanConsumer3 = new LoanConsumer("Gerhard", 17, 200000);

        LoanIssuer loanIssuer1 = new LoanIssuer("Anton", false, false);
        LoanIssuer loanIssuer2 = new LoanIssuer("Stephan", true, false);
        LoanIssuer loanIssuer3 = new LoanIssuer("Alex", false, true);
        LoanIssuer loanIssuer4 = new LoanIssuer("Max", true, true);


        System.out.println(loanIssuer1.printMsg(loanIssuer1.toIssue(loanConsumer1), loanConsumer1));
        System.out.println(loanIssuer1.printMsg(loanIssuer1.toIssue(loanConsumer2), loanConsumer2));

        System.out.println(loanIssuer2.printMsg(loanIssuer2.toIssue(loanConsumer1), loanConsumer1));
        System.out.println(loanIssuer2.printMsg(loanIssuer2.toIssue(loanConsumer2), loanConsumer2));

        System.out.println(loanIssuer3.printMsg(loanIssuer3.toIssue(loanConsumer1), loanConsumer1));
        System.out.println(loanIssuer3.printMsg(loanIssuer3.toIssue(loanConsumer2), loanConsumer2));
    }
}
