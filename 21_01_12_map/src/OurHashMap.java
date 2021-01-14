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
    private static final int INITIAL_CAPACITY = 8;

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

    /**
     * Hash function
     *
     * @param key
     * @return
     */
    static int hash(Object key) {
        return Math.abs(key.hashCode());
    }

    public OurHashMap() {
        source = new Pair[INITIAL_CAPACITY]; // [<K1, V1>, <K2, V2>, ..., <K16, V16>] -> [<null, null>,.. <null, null>]
        capacity = INITIAL_CAPACITY;
        size = 0;
        loadFactor = DEFAULT_LOAD_FACTOR;
    }

    public OurHashMap(double loadFactor) {
        this();
        this.loadFactor = loadFactor;
    }

    /**
     * Return actual size of the map
     *
     * @return size of map
     */
    @Override
    public int size() {
        return size;
    }

    @Override
    public V put(K key, V value) {
        if (size >= loadFactor * capacity) {
            System.out.println("DO REHASH!");
            resize();
        }

        Pair<K, V> pair = find(key);

        if (pair != null) {

            V res = pair.value;
            pair.value = value;

            return res;
        }

        int index = hash(key) % capacity;


        Pair<K, V> newPair = new Pair<>(key, value, source[index]); // esli est tam uze Pair, to ona zapishetsja (source[index]) w pole NEXT, esli net to NULL

        // System.out.println("newPair.key: " + newPair.key);
        // System.out.println("newPair.value: " + newPair.value);
        // System.out.println("newPair.next: " + newPair.next);

        // pomestim posledniju prishedshuju Pair na etot index. (zapishem staruju Pair wnutri novoj w pole - NEXT)
        source[index] = newPair;
        size++;

        return null;
    }

    private void resize() {
        capacity = capacity * 2;
        Pair<K, V>[] newSource = new Pair[capacity];

        for (Pair<K, V> cell : source) {

            Pair<K, V> currentPair = cell;
            while (currentPair != null) {
                int newIndex = hash(currentPair.key) % capacity;
                currentPair.next = newSource[newIndex];
                newSource[newIndex] = currentPair;

                currentPair = currentPair.next;
            }
        }

        source = newSource;
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
        if (size() == 0)
            return null;

        Pair<K, V> pair = find(key);

        if (pair == null)
            return null;

        return pair.value;
    }

    @Override
    public V remove(K key) {
        if (size() == 0)
            return null;

        // Pair<K, V> pair = find(key);

        int index = Math.abs(key.hashCode() % capacity);

        Pair<K, V> pairToRemove = source[index];

        if (pairToRemove == null)
            return null;

        if (pairToRemove.next == null) { // 1. case: We have only one Pair in this cell (at this index)
            source[index] = null;
            size--;

            return pairToRemove.value;
        } else { // 2. case: We have more as one Pair in this cell (at this index)

            Pair<K, V> currentPair = pairToRemove;

            while (currentPair != null) { // perebor Pairs wnutri cell

                System.out.println("currentPair: " + currentPair);

                if (key.equals(currentPair.key)) {

                    System.out.println("- - > currentPair.next: " + currentPair.next);
                    System.out.println("- - > currentPair.next: " + currentPair.next);

                    currentPair = currentPair.next;
                    size--;
                    return currentPair.value;
                }





                currentPair = currentPair.next;
            }
        }

        return pairToRemove.value;
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

/*        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public Pair<K, V> getNext() {
            return next;
        }*/

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
