import java.util.Collection;
import java.util.Iterator;

/**
 * This class implements the OurSet interface, backed by an OurHashMap instance.
 */

public class OurHashSet<T> implements OurSet<T> {

    private final transient OurHashMap<T, Object> source;

    // Dummy value to associate with an Object in the backing Map
    private static final Object commonValue = new Object();

    public OurHashSet() {
        source = new OurHashMap<>();
    }

    public OurHashSet(Collection<? extends T> collection) {
        source = new OurHashMap<>(Math.max((int) (collection.size() / .75f) + 1, 16));
        addAll((OurSet<T>) collection);
    }

    public OurHashSet(int initialCapacity) {
        source = new OurHashMap<>(initialCapacity);
    }

    public int size() {
        return source.size();
    }


    public boolean contains(Object o) {
        return source.containsKey((T) o);
    }

    public boolean add(T e) {
        return source.put(e, commonValue) == null;
    }

    public boolean remove(Object o) {
        return source.remove((T) o) == commonValue;
    }

    @Override
    public void addAll(OurSet<T> another) {

    }

    @Override
    public void retainAll(OurSet<T> another) {

    }

    @Override
    public void removeAll(OurSet<T> another) {

    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
