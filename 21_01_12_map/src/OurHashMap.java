import java.util.Arrays;
import java.util.Iterator;

/**
 * The implementation of OurMap can not contain null as a key.
 *
 * @param <K>
 * @param <V>
 */
public class OurHashMap<K, V> implements OurMap<K, V> {
    private static final double DEFAULT_LOAD_FACTOR = 0.75;
    private static final int INITIAL_CAPACITY = 16;

    private Pair<K, V>[] source;
    private int size;
    private double loadFactor;
    private int capacity;

    @Override
    public String toString() {
        return "OurHashMap{" +
                "source=" + Arrays.toString(source) +
                ", size=" + size +
                ", loadFactor=" + loadFactor +
                ", capacity=" + capacity +
                '}';
    }

    public OurHashMap() {
        source = new Pair[INITIAL_CAPACITY]; // [<K1, V1>, <K2, V2>, <K3, V3>, <K4, V4>] -> [<null, null>,.. <null, null>]
        capacity = INITIAL_CAPACITY;
        size = 0;
        loadFactor = DEFAULT_LOAD_FACTOR;
    }

    static int hash(Object key) {
        return Math.abs(key.hashCode());
    }

    public OurHashMap(double loadFactor) {
        this();
        this.loadFactor = loadFactor;
    }

    /**
     * @return size of map
     */
    @Override
    public int size() {
        return size;
    }

    @Override
    public V put(K key, V value) {
        if (size >= loadFactor * capacity)
            resize();

        Pair<K, V> pair = find(key);


        if (pair != null) {

            /////////////////////////////////////////////////////////
            System.out.println("pair: " + pair);
            System.out.println();
            /////////////////////////////////////////////////////////

            V res = pair.value;
            pair.value = value;
            size++;
            return res;
        }

        /////////////////////////////////////////////////////////
        System.out.println("pair: " + pair);
        System.out.println();
        /////////////////////////////////////////////////////////

        int index = hash(key) % capacity;

        /////////////////////////////////////////////////////////
        System.out.println("index: " + index);
        System.out.println();
        /////////////////////////////////////////////////////////

        Pair<K, V> newPair = new Pair<>(key, value, source[index]);

        ///////////////////////////////////////////////////////
        System.out.println("newPair: " + newPair);
        System.out.println();
        ///////////////////////////////////////////////////////

        System.out.println("newPair.key: " + newPair.key);
        System.out.println("newPair.value: " + newPair.value);
        System.out.println("newPair.next: " + newPair.next);


        source[index] = newPair;
        size++;
        return null;
    }

    private void resize() {

    }

    private Pair<K, V> find(K key) {

        int index = Math.abs(key.hashCode() % capacity);

        Pair<K, V> current = source[index];

        while (current != null) {
            if (key.equals(current.key))
                return current;
            current = current.next;
        }

        return null;
    }

    @Override
    public V get(K key) {
        int index = Math.abs(key.hashCode() % capacity);

        Pair<K, V> current = source[index];

        Pair<K, V>     current2 = (Pair<K, V>) current.getKey();


        return current2;
    }

    @Override
    public V remove(K key) {
        return null;
    }


    /**
     * Returns {@code true} if this map contains no key-value mappings.
     *
     * @return {@code true} if this map contains no key-value mappings
     */
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public Iterator<K> keyIterator() {
        return null;
    }

    @Override
    public Iterator<V> valueIterator() {
        return null;
    }

    static private class Pair<K, V> {
        K key;
        V value;
        Pair<K, V> next;

        public Pair(K key, V value, Pair<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public Pair<K, V> getNext() {
            return next;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "key=" + key +
                    ", value=" + value +
                    ", next=" + next +
                    '}';
        }
    }
}