import java.util.Stack;

// A user defined stack that supports getMax() in addition to push() and pop()
class MyStack {

    Stack<Integer> stack = new Stack<Integer>();
    int maxElement;

    // getMax() : Get maximum element of MyStack
    void getMax() {
        if (stack.empty())
            System.out.print("Stack is empty\n");

            // variable maxElement stores in self the maximum element of the stack.
        else
            System.out.print("Element with biggest value" +
                    ": " + maxElement + "\n");
    }


    // addLast()
    // The addLast(Object item) method is used to pushes an item onto the top of this stack.
    void addLast(int x) {
        // Insert new number into the stack
        if (stack.empty()) {
            maxElement = x;
            stack.push(x);
            System.out.print("Number inserted: " + x + "\n");
            return;
        }

        // If new number is greater than maxElement
        if (x > maxElement) {
            stack.push(2 * x - maxElement);
            maxElement = x;
        } else // If new number is less than maxElement
            stack.push(x);

        System.out.print("Number inserted: " + x + "\n");
    }


    // getLast()
    // Get top element of MyStack
    // The method returns the element at the top of the Stack
    // else returns NULL if the Stack is empty.
    void getLast() {
        if (stack.empty()) {

            System.out.print("Stack is empty ");
            return;
        }

        int topElement = stack.peek(); // Top element. getLast()

        System.out.print("Top element is: ");

        // If t < maxElement means maxElement stores value of t.
        if (topElement > maxElement)
            System.out.print(maxElement);
        else
            System.out.print(topElement);
    }

    // removeLast()
    // Remove the top element from MyStack
    void removeLast() {
        if (stack.empty()) {
            System.out.print("Stack is empty\n");
            return;
        }

        System.out.print("Top element removed: ");
        int topElement = stack.peek();
        stack.pop();

        // Maximum will change as the maximum element of the stack is being removed.
        if (topElement > maxElement) {
            System.out.print(maxElement + "\n");
            maxElement = 2 * maxElement - topElement;
        } else
            System.out.println(topElement + "\n");
    }
}
