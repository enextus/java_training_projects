import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] argv) throws Exception {
        Integer[] intArrOne = new Integer[]{1, 44, 55, 66, 33, 22};

        System.out.println("intArrOne.length: " + intArrOne.length);

        System.out.println(intArrOne[0]);



        Integer a = Integer.valueOf("123"); // Integer a = new Integer("123");

        List<Integer> list = Arrays.asList(intArrOne);


        System.out.println(list.isEmpty());


        System.out.println("list:  " + list);
        System.out.println("list.size(): " + list.size());
        System.out.println("list:  " + list.getClass());

        list.add(a);

        System.out.println(list);








        Solution solution = new Solution();
        System.out.println(solution.solve(list, 6));
    }
}
