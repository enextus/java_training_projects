import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        final int a;
        final int b;
        final int c;

        a = 2;
        b = 5;
        c = 10;

        Function<Integer, Integer> closureFunc = (x) -> (a * (x * x)) + (b * x) + c;

        System.out.println(closureFunc.apply(666));

        // 890452
    }

}
