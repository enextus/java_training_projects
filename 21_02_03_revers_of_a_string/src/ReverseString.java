import java.util.ArrayDeque;

public class ReverseString {

    public String reverseString(String str) {

        ArrayDeque<Character> stack = new ArrayDeque<>();
        String result = "";

        for (Character character : str.toCharArray()) {
            stack.add(character);
        }

        while (!stack.isEmpty()) {
            result = result + stack.pop();
        }

        return result;
    }

}
