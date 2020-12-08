import java.util.Iterator;

public class SimpleArrayIterator implements Iterator<Integer> {

    private int currentIndex = 0;
    private final int[] source;

    public SimpleArrayIterator(int[] source) {
        this.source = source;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < source.length;
    }

    @Override
    public Integer next() {
        int res = source[currentIndex];
        currentIndex++;
        return res;
//        return source[currentIndex++];
    }
}
