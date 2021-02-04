import java.util.Stack;

public class ReverseString {

    public String reverseString(String str) {

        Stack<Character> stack = new Stack<>();
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
