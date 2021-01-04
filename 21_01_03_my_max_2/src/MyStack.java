import java.util.ArrayDeque;
// import java.util.Stack; // very old Stack, ArrayDeque is better

// An user defined stack that supports getMax() with O (1) time and O (1) extra space complexity
class MyStack {

    ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
    int maxElement;

    public int getMax() {
        if (stack.isEmpty())
            throw new IndexOutOfBoundsException();

        return maxElement;
    }

    public int addLast(int element) {
        if (stack.isEmpty()) {
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
        if (stack.isEmpty())
            throw new IndexOutOfBoundsException();

        int topElement = stack.peek();
        stack.pop();

        if (topElement > maxElement) {
            maxElement = 2 * maxElement - topElement;

            return (topElement + maxElement) / 2;
        }

        return topElement;
    }

    public int getLast() {
        if (stack.isEmpty())
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
