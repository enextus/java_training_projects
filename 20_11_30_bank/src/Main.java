public class Main {
    public static void main(String[] args) {
        LoanIssuer loanIssuer1 = new LoanIssuer("Anton", false, false);
        LoanIssuer loanIssuer2 = new LoanIssuer("Stephan", true, false);
        LoanIssuer loanIssuer3 = new LoanIssuer("Alex", false, true);
        LoanIssuer loanIssuer4 = new LoanIssuer("Max", true, true);

        LoanConsumer loanConsumer1 = new LoanConsumer("Mark", 18, 25000);
        LoanConsumer loanConsumer2 = new LoanConsumer("Petr", 50, 30000);
        LoanConsumer loanConsumer3 = new LoanConsumer("Mario", 55, 19000);
        LoanConsumer loanConsumer4 = new LoanConsumer("Gerhard", 17, 200000);
        LoanConsumer loanConsumer5 = new LoanConsumer("Axel", 80, 200000);

        // Issuer 1
        System.out.println(loanIssuer1.printMsg(loanIssuer1.toIssue(loanConsumer1), loanConsumer1));
        System.out.println(loanIssuer1.printMsg(loanIssuer1.toIssue(loanConsumer2), loanConsumer2));
        System.out.println(loanIssuer1.printMsg(loanIssuer1.toIssue(loanConsumer3), loanConsumer3));
        System.out.println(loanIssuer1.printMsg(loanIssuer1.toIssue(loanConsumer4), loanConsumer4));
        System.out.println(loanIssuer1.printMsg(loanIssuer1.toIssue(loanConsumer5), loanConsumer5));
        System.out.println();

        // Issuer 2
        System.out.println(loanIssuer2.printMsg(loanIssuer2.toIssue(loanConsumer1), loanConsumer1));
        System.out.println(loanIssuer2.printMsg(loanIssuer2.toIssue(loanConsumer2), loanConsumer2));
        System.out.println(loanIssuer2.printMsg(loanIssuer2.toIssue(loanConsumer3), loanConsumer3));
        System.out.println(loanIssuer2.printMsg(loanIssuer2.toIssue(loanConsumer4), loanConsumer4));
        System.out.println(loanIssuer2.printMsg(loanIssuer2.toIssue(loanConsumer5), loanConsumer5));
        System.out.println();

        // Issuer 3
        System.out.println(loanIssuer3.printMsg(loanIssuer3.toIssue(loanConsumer1), loanConsumer1));
        System.out.println(loanIssuer3.printMsg(loanIssuer3.toIssue(loanConsumer2), loanConsumer2));
        System.out.println(loanIssuer3.printMsg(loanIssuer3.toIssue(loanConsumer3), loanConsumer3));
        System.out.println(loanIssuer3.printMsg(loanIssuer3.toIssue(loanConsumer4), loanConsumer4));
        System.out.println(loanIssuer3.printMsg(loanIssuer3.toIssue(loanConsumer5), loanConsumer5));
        System.out.println();

        // Issuer 4
        System.out.println(loanIssuer4.printMsg(loanIssuer4.toIssue(loanConsumer1), loanConsumer1));
        System.out.println(loanIssuer4.printMsg(loanIssuer4.toIssue(loanConsumer2), loanConsumer2));
        System.out.println(loanIssuer4.printMsg(loanIssuer4.toIssue(loanConsumer3), loanConsumer3));
        System.out.println(loanIssuer4.printMsg(loanIssuer4.toIssue(loanConsumer4), loanConsumer4));
        System.out.println(loanIssuer4.printMsg(loanIssuer4.toIssue(loanConsumer5), loanConsumer5));
        System.out.println();

/*        Bank employee Anton declined a loan to Mark.
        Bank employee Anton declined a loan to Petr.
        Bank employee Anton declined a loan to Mario.
        Bank employee Anton declined a loan to Gerhard.
        Bank employee Anton declined a loan to Axel.

        Bank employee Stephan allowed a loan to Mark.
        Bank employee Stephan allowed a loan to Petr.
        Bank employee Stephan declined a loan to Mario.
        Bank employee Stephan declined a loan to Gerhard.
        Bank employee Stephan allowed a loan to Axel.

        Bank employee Alex allowed a loan to Mark.
        Bank employee Alex allowed a loan to Petr.
        Bank employee Alex declined a loan to Mario.
        Bank employee Alex declined a loan to Gerhard.
        Bank employee Alex declined a loan to Axel.

        Bank employee Max allowed a loan to Mark.
        Bank employee Max allowed a loan to Petr.
        Bank employee Max declined a loan to Mario.
        Bank employee Max declined a loan to Gerhard.
        Bank employee Max allowed a loan to Axel.*/

    }
}
