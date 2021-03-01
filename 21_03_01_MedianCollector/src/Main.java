import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> integerLst = Arrays.asList(-10, 1, 12, 23, 23, 23, 100);

        MedianCollector medianCollector = new MedianCollector();
        Integer res = integerLst.stream().collect(medianCollector);

       System.out.println(res);
    }

}
