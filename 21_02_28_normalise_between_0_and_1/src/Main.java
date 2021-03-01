import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        // NormCollector normCollector = new NormCollector();
        // NormUtil normUtil = new NormUtil(150.23, -10.12, 1.45, 0.01);
        // System.out.println(normUtil);
        // System.out.println(normUtil.normalize(-5.12));

        Stream<Double> doubleStream = Stream.of(150.23, -10.12, 1.45, 0.01);

        Double res = doubleStream.collect(new NormCollector());

        System.out.println(res);

    }

}
