import java.util.stream.IntStream;

public class Factorial {

    public int calcFact(int num) {
        IntStream.rangeClosed(2, num).reduce(1, (x, y) -> x * y);

        return 0;
    }

}
