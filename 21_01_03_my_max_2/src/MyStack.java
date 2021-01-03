import java.util.Stack;

// An user defined stack that supports getMax()
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

        if (element > maxElement) {         // If new number is greater than maxElement
            stack.push(2 * element - maxElement);
            maxElement = element;
        } else                              // If new number is less than maxElement
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
        else
            return topElement;
    }

    public int size() {
        return stack.size();
    }
}
