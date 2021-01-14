import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Solution sol = new Solution();

        Integer[] spam = new Integer[] {1, 2, 6, 12, 55, 77, 79, 89, 100, 123, 180, 300};
        List<Integer> list = Arrays.asList(spam);

        sol.maxCoveredPoints( list, 13);
    }
}
