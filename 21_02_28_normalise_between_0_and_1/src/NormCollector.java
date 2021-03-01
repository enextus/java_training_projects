import java.util.*;
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
        return (doubleArrayList, doubleArrayListOther) -> { // if we have a more as one thread
            doubleArrayList.addAll(doubleArrayListOther);
            return doubleArrayList;
        };
    }

    @Override
    public Function<ArrayList<Double>, Double> finisher() {
        return doubleStream -> { // our lambda function to calculate the result

            Collections.sort(doubleStream);

            double dataHigh = doubleStream.stream().max(Comparator.naturalOrder()).get();
            double dataLow = doubleStream.stream().min(Comparator.naturalOrder()).get();
            double normalizedHigh = 1.;
            double normalizedLow = 0.;

            // (element -> ((element - dataLow) / (dataHigh - dataLow)) * (normalizedHigh - normalizedLow) + normalizedLow);


/*            ((x - dataLow)
                    / (dataHigh - dataLow))
                    * (normalizedHigh - normalizedLow) + normalizedLow;*/

            return ((doubleStream
                    .stream()
                    .reduce(doubleValue ->  (   (      doubleValue - dataLow) / (dataHigh - dataLow)) * (normalizedHigh - normalizedLow) + normalizedLow)    ));

        };

    }

    @Override
    public Set<Characteristics> characteristics() {
        return EnumSet.of(Characteristics.CONCURRENT);
    }

}
