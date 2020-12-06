import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void test_givenWhenInstanceIsCorrect_thenReturnTrue() {


        Auto opel = new Auto("Opel", "grey");
        assertTrue(opel instanceof Auto);

    }
}