import java.util.List;
import java.util.Map;

public class Solve {

    List<Cut> cuts;
    List<Integer> numbers;

    public Solve(List<Cut> cuts, List<Integer> numbers) {
        this.cuts = cuts;
        this.numbers = numbers;
    }

    public Map<Integer, Integer> solve() {

        // cuts, numbers;

        for (int i = 0; i < numbers.size(); i++) {

            System.out.println(numbers.get(i));

        }

        return null;
    }

}
