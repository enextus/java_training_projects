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
            stack.addLast(element);

            return element;
        }

        if (element > maxElement) {
            stack.addLast(2 * element - maxElement);
            maxElement = element;
        } else
            stack.addLast(element);

        return element;
    }

    public int removeLast() {
        if (stack.isEmpty())
            throw new IndexOutOfBoundsException();

        int topElement = stack.getLast();
        stack.removeLast();

        if (topElement > maxElement) {
            maxElement = 2 * maxElement - topElement;

            return (topElement + maxElement) / 2;
        }

        return topElement;
    }

    public int getLast() {
        if (stack.isEmpty())
            throw new IndexOutOfBoundsException();

        int topElement = stack.getLast();

        if (topElement > maxElement)
            return maxElement;

        return topElement;
    }

    public int size() {
        return stack.size();
    }
}
