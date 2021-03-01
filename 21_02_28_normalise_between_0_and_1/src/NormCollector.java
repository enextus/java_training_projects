import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class NormCollector implements Collector<Double, ArrayList<Double>, Double> {
    @Override
    public Supplier<ArrayList<Double>> supplier() {
        return ArrayList::new; // create a new ArrayList Object, temporary container for data store
    }

    @Override
    public BiConsumer<ArrayList<Double>, Double> accumulator() {
        return ArrayList::add; // add an element to our ArrayList without any changes in this case
    }

    @Override
    public BinaryOperator<ArrayList<Double>> combiner() {
        return null; // we have had only one thread
    }

    @Override
    public Function<ArrayList<Double>, Double> finisher() {
        return doubleStream -> {

            long size = doubleStream.size();

            if (size % 2 == 0) {

                return doubleStream
                        .stream()
                        .mapToDouble(i -> i)
                        .average()
                        .getAsDouble();
            }

            return doubleStream
                    .stream()
                    .skip(size % 2 + 2)
                    .findFirst()
                    .orElse(null);
        };

    }

    @Override
    public Set<Characteristics> characteristics() {
        return EnumSet.of(Characteristics.CONCURRENT);
    }

}
