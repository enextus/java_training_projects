import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoanIssuerTest {

    @Test
    void testToIssue_ageLowerAs18_false() {
        for (int i = -1; i < 17; i++) {
            LoanIssuer loanIssuer = new LoanIssuer("a", false, false);
            assertFalse(loanIssuer.toIssue(new LoanConsumer("b", i, 21000)));
        }
    }

    @Test
    void testToIssue_ageLowerAs18AndLowerAs20000_false() {
        for (int i = -1; i < 18; i++) {
            for (int j = -1; j < 20000; j++) {
                LoanIssuer loanIssuer = new LoanIssuer("a", false, false);
                assertFalse(loanIssuer.toIssue(new LoanConsumer("b", i, j)));
            }
        }
    }

    @Test
    void testToIssue_ageUpperAs17AndLowerAs20000_false() {
        for (int i = 18; i < 20; i++) {
            for (int j = -1; j < 20000; j++) {
                LoanIssuer loanIssuer = new LoanIssuer("a", false, false);
                assertFalse(loanIssuer.toIssue(new LoanConsumer("b", i, j)));
            }
        }
    }

    @Test
    void testToIssue_ageUpperAs17AndUpperAs19999_isLazyTrueAndKindFalse_true() {
        for (int i = 18; i < 20; i++) {
            for (int j = 20000; j < 20002; j++) {
                LoanIssuer loanIssuer = new LoanIssuer("a", true, false);
                assertTrue(loanIssuer.toIssue(new LoanConsumer("b", i, j)));
            }
        }
    }

    @Test
    void testToIssue_ageUpperAs17AndUpperAs19999_isLazyTrueAndKindTrue_true() {
        for (int i = 18; i < 20; i++) {
            for (int j = 20000; j < 20002; j++) {
                LoanIssuer loanIssuer = new LoanIssuer("a", true, true);
                assertTrue(loanIssuer.toIssue(new LoanConsumer("b", i, j)));
            }
        }
    }

    @Test
    void testToIssue_ageLowerAs70And_isLazyTrueAndKindTrue_true() {
        for (int i = 69; i > 17; i--) {
            LoanIssuer loanIssuer = new LoanIssuer("a", true, true);
            assertTrue(loanIssuer.toIssue(new LoanConsumer("b", i, 20001)));
        }
    }

    @Test
    void testToIssue_ageLowerAs70And_isLazyFalseAndKindTrue_true() {
        for (int i = 69; i > 17; i--) {
            LoanIssuer loanIssuer = new LoanIssuer("a", false, true);
            assertTrue(loanIssuer.toIssue(new LoanConsumer("b", i, 20001)));
        }
    }

    @Test
    void testToIssue_ageLowerAs50And_isLazyFalseAndKindTrue_true() {
        for (int i = 49; i > 17; i--) {
            LoanIssuer loanIssuer = new LoanIssuer("a", false, true);
            assertTrue(loanIssuer.toIssue(new LoanConsumer("b", i, 20001)));
        }
    }

    @Test
    void testToIssue_ageLowerAs50And_isLazyTrueAndKindTrue_true() {
        for (int i = 49; i > 17; i--) {
            LoanIssuer loanIssuer = new LoanIssuer("a", true, true);
            assertTrue(loanIssuer.toIssue(new LoanConsumer("b", i, 20001)));
        }
    }

}
