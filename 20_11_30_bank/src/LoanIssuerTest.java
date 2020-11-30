import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoanIssuerTest {

/*    LoanIssuer loanIssuer1 = new LoanIssuer("Anton", false, false);
    LoanIssuer loanIssuer2 = new LoanIssuer("Stephan", true, false);
    LoanIssuer loanIssuer3 = new LoanIssuer("Alex", false, true);
    LoanIssuer loanIssuer4 = new LoanIssuer("Max", true, true);

    LoanConsumer loanConsumer1 = new LoanConsumer("Mark", 18, 25000);
    LoanConsumer loanConsumer2 = new LoanConsumer("Petr", 50, 30000);
    LoanConsumer loanConsumer3 = new LoanConsumer("Mario", 55, 19000);
    LoanConsumer loanConsumer4 = new LoanConsumer("Gerhard", 17, 200000);
    LoanConsumer loanConsumer5 = new LoanConsumer("Axel", 80, 200000);*/

    @Test
    void testToIssue_ageLowerAs18_false() {
        for (int i = -1; i < 17; i++) {
            LoanIssuer loanIssuer = new LoanIssuer("a", false, false);
            assertEquals(false, loanIssuer.toIssue(new LoanConsumer("b", i, 21000)));
        }
    }

    @Test
    void testToIssue_ageLowerAs18AndLowerAs20000_false() {
        for (int i = -1; i < 17; i++) {
            for (int j = -1; j < 20000; j++) {
                LoanIssuer loanIssuer = new LoanIssuer("a", false, false);
                assertEquals(false, loanIssuer.toIssue(new LoanConsumer("b", i, j)));
            }
        }
    }

    @Test
    void testToIssue_ageUpperAs17AndLowerAs20000_false() {
        for (int i = 18; i < 19; i++) {
            for (int j = -1; j < 20000; j++) {
                LoanIssuer loanIssuer = new LoanIssuer("a", false, false);
                assertEquals(false, loanIssuer.toIssue(new LoanConsumer("b", i, j)));
            }
        }
    }

    @Test
    void testToIssue_ageUpperAs17AndUpperAs19999_isLazyTrueAndKindFalse_true() {
        for (int i = 18; i < 19; i++) {
            for (int j = 20000; j < 20001; j++) {
                LoanIssuer loanIssuer = new LoanIssuer("a", true, false);
                assertEquals(true, loanIssuer.toIssue(new LoanConsumer("b", i, j)));
            }
        }
    }

    @Test
    void testToIssue_ageUpperAs17AndUpperAs19999_isLazyTrueAndKindTrue_true() {
        for (int i = 18; i < 19; i++) {
            for (int j = 20000; j < 20001; j++) {
                LoanIssuer loanIssuer = new LoanIssuer("a", true, true);
                assertEquals(true, loanIssuer.toIssue(new LoanConsumer("b", i, j)));
            }
        }
    }
}