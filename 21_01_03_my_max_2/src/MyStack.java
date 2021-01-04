import java.util.Stack;

// An user defined stack that supports getMax() with O (1) time and O (1) extra space complexity
class MyStack {

    Stack<Integer> stack = new Stack<Integer>();
    int maxElement;

    public int getMax() {
        if (stack.empty())
            throw new IndexOutOfBoundsException();

        return maxElement;
    }

    public int addLast(int element) {
        if (stack.empty()) {
            maxElement = element;
            stack.push(element);

            return element;
        }

        if (element > maxElement) {
            stack.push(2 * element - maxElement);
            maxElement = element;
        } else
            stack.push(element);

        return element;
    }

    public int removeLast() {
        if (stack.empty())
            throw new IndexOutOfBoundsException();

        int topElement = stack.peek();
        stack.pop();

        if (topElement > maxElement)
            maxElement = 2 * maxElement - topElement;

        return topElement;
    }

    public int getLast() {
        if (stack.empty())
            throw new IndexOutOfBoundsException();

        int topElement = stack.peek();

        if (topElement > maxElement)
            return maxElement;

        return topElement;
    }

    public int size() {
        return stack.size();
    }
}
