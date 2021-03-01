import java.util.EnumSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class MedianCollector implements Collector<Integer, TreeSet<Integer>, Integer> {
    @Override
    public Supplier<TreeSet<Integer>> supplier() {
        return TreeSet::new; // create a new TreeSet Object
    }

    @Override
    public BiConsumer<TreeSet<Integer>, Integer> accumulator() {
        return TreeSet::add; // add an element to TreeSet
    }

    @Override
    public BinaryOperator<TreeSet<Integer>> combiner() {
        return (l, r) -> {
            l.addAll(r);
            return l;
        };
    }

    @Override
    public Function<TreeSet<Integer>, Integer> finisher() {
        return set -> {

            long size = set.size();

            if (size % 2 == 0) {

                return (int) set
                        .stream()
                        .skip(1)
                        .limit(100)
                        .mapToInt(i -> i)
                        .average()
                        .getAsDouble();
            }

            return set
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
