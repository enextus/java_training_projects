import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String[] programming_languages = new String[]{"language:java", "os:linux", "editor:emacs"};

        List<String> strLst = new ArrayList<>();

        strLst.add("java");
        strLst.add("python");
        strLst.add("nodejs");
        strLst.add("ruby");

        // List<Integer> integerLst = Arrays.asList(-10, -4, 9, 12, 50);

        MedianCollector medianCollector = new MedianCollector();
        Integer res = strLst.stream().map(String::length).collect(medianCollector);

        System.out.println(res);

    }

}
