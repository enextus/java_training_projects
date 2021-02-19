import java.util.stream.IntStream;

public class Factorial<Integer> {

    public int calcFact(int num) {
        int res;
        res = IntStream.rangeClosed(2, num).reduce(1, (x, y) -> x * y);

        return res;
    }

}
