import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoanIssuerTest {

    LoanIssuer loanIssuer1 = new LoanIssuer("Anton", false, false);
    LoanIssuer loanIssuer2 = new LoanIssuer("Stephan", true, false);
    LoanIssuer loanIssuer3 = new LoanIssuer("Alex", false, true);
    LoanIssuer loanIssuer4 = new LoanIssuer("Max", true, true);

    LoanConsumer loanConsumer1 = new LoanConsumer("Mark", 18, 25000);
    LoanConsumer loanConsumer2 = new LoanConsumer("Petr", 50, 30000);
    LoanConsumer loanConsumer3 = new LoanConsumer("Mario", 55, 19000);
    LoanConsumer loanConsumer4 = new LoanConsumer("Gerhard", 17, 200000);
    LoanConsumer loanConsumer5 = new LoanConsumer("Axel", 80, 200000);

    @Test
    void testToIssue_() {
        assertEquals(false, loanIssuer1.toIssue(loanConsumer1));
    }
}