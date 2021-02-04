import java.util.Stack;

public class ReverseString {

    public String reverseString(String str) {

        Stack<Character> stack = new Stack<>();
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
