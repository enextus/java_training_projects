import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        IntService intService = new IntService();

        System.out.println(intService.isPrime(1));
        System.out.println(intService.isPrime(7));

        IntStream intStream1 = IntStream.of(1, 30);
        IntStream intStream2 = IntStream.of(6, 49);

        System.out.println(intService.compose(intStream1, intStream2));


/*        List<String> mList = Arrays.asList("aa1","cc2", "cc1", "aa2", "bb1");

        mList.stream()
                .filter(s -> s.startsWith("a"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);*/
    }

}
