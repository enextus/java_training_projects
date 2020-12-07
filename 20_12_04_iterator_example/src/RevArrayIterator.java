
import java.util.Iterator;

public class RevArrayIterator implements Iterator<Integer> {

    private final int[] arrayToIterate;
    private int currentIndex = 0;

    RevArrayIterator(int[] arrayToIterate) {
        this.arrayToIterate = arrayToIterate;
    }


    public boolean hasPrev() {
        return currentIndex < arrayToIterate.length;
    }

    public Integer prev() {
        int res = arrayToIterate[currentIndex];
        currentIndex++;
        return res;
//        return arrayToIterate[currentIndex++];
    }



    public boolean hasNext() {
        return currentIndex < arrayToIterate.length;
    }

    public Integer next() {
        int res = arrayToIterate[currentIndex];
        currentIndex++;
        return res;
//        return arrayToIterate[currentIndex++];
    }
}
