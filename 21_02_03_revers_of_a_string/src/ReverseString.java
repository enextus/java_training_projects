import java.util.ArrayDeque;

public class ReverseString {

    public String reverseString(String str) {

        ArrayDeque<Character> stack = new ArrayDeque<>();
        String res = "";

        for (Character character : str.toCharArray()) {
            stack.add(character);
        }

        while (!stack.isEmpty()) {
            res = res + stack.pop();
        }

        return res;
    }

}
