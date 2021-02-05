import java.util.*;

public class FindTheLostNumber {

    Integer lostNUmber;

    public FindTheLostNumber() {
        this.lostNUmber = generateTheLostNumber();
    }

    public Integer getLostNUmber() {
        return lostNUmber;
    }

    public Integer findTheLostNumber(Set<Integer> intSetFull, List<Integer> intList) {
        intSetFull.removeAll(intList);

        return intSetFull.iterator().next();
    }

    Integer generateTheLostNumber() {
        Random rnd = new Random();
        int low = 1;
        int high = 100;
        int secretNumber = rnd.nextInt(high - low) + low;

        return secretNumber;
    }

    List<Integer> generateTheList() {
        List<Integer> intList = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            if (i == getLostNUmber())
                continue;

            intList.add(i);
        }

        Collections.shuffle(intList);

        return intList;
    }

    Set<Integer> generateAHundredNumbers() {
        Set<Integer> intSetFull = new TreeSet<>(); // ordered

        for (int i = 1; i <= 100; i++) {
            intSetFull.add(i);
        }

        return intSetFull;
    }

}
