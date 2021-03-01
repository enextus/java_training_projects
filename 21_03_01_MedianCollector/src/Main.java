import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        List<Integer> integerLst = Arrays.asList(-10, -4, 9, 12, 50);

        MedianCollector medianCollector = new MedianCollector();
        Integer res = integerLst.stream().collect(medianCollector);

       System.out.println(res);

    }

}
