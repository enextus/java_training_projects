import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class NormCollector implements Collector<Double, ArrayList<Double>, Double> {

    double normalizedHigh;
    double normalizedLow;
    double identity;

    public NormCollector(double normalizedHigh, double normalizedLow, double identity) {
        this.normalizedHigh = normalizedHigh;
        this.normalizedLow = normalizedLow;
        this.identity = identity;
    }

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
        return (doubleArrayList, doubleArrayListOther) -> { // if we have more as one thread
            doubleArrayList.addAll(doubleArrayListOther);
            return doubleArrayList;
        };
    }

    @Override
    public Function<ArrayList<Double>, Double> finisher() {
        return doubleArrayList -> { // our lambda function to calculate the result

            Collections.sort(doubleArrayList);

            double dataHigh = doubleArrayList.stream().max(Comparator.naturalOrder()).get();
            double dataLow = doubleArrayList.stream().min(Comparator.naturalOrder()).get();

            return ((doubleArrayList
                    .stream()
                    .reduce(identity,
                            (currentRes, currentNum) -> currentRes - dataLow) /
                    (dataHigh - dataLow) * (normalizedHigh - normalizedLow) + normalizedLow));
        };
    }

    @Override
    public Set<Characteristics> characteristics() {
        return EnumSet.of(Characteristics.CONCURRENT);
    }

    @Override
    public String toString() {
        return "NormCollector{" +
                "normalizedHigh=" + normalizedHigh +
                ", normalizedLow=" + normalizedLow +
                ", identity=" + identity +
                '}';
    }

}
