import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> integerLst = Arrays.asList(1, 1, 2, 3, 4);

        MedianCollector medianCollector = new MedianCollector();
        Integer res = integerLst.stream().collect(medianCollector);

       System.out.println(res);
    }

}
