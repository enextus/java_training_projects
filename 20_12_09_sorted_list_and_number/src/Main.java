import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] argv) throws Exception {
        Integer[] intArrOne = new Integer[]{1, 44, 55, 66, 33, 22};

        System.out.println("intArrOne.length: " + intArrOne.length);

        System.out.println(intArrOne[0]);

        Integer a = Integer.valueOf("123"); // Integer a = new Integer("123");

        List<Integer> list = Arrays.asList(intArrOne);

        List<Integer> list2 = new ArrayList<>(Arrays.asList(intArrOne));

        System.out.println("list2.isEmpty(): " + list2.isEmpty());

        System.out.println("list2:  " + list2);
        System.out.println("list2.size(): " + list2.size());
        System.out.println("list2:  " + list2.getClass());

        list2.add(a);

        System.out.println("list2: " + list2);

        Solution solution = new Solution();
        System.out.println(solution.solve(list, 6));
    }
}
