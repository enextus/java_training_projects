import java.util.Stack;

// A user defined stack that supports getMax()
class MyStack {

    Stack<Integer> stack = new Stack<Integer>();
    int maxElement;

    void getMax() {
        if (stack.empty()) {

            System.out.print("Stack is empty\n");
            return;
        }

        System.out.print("Element with biggest value" +
                ": " + maxElement + "\n");
    }

    void addLast(int element) {
        if (stack.empty()) {

            maxElement = element;
            stack.push(element);

            System.out.print("Number inserted: " + element + "\n");
            return;
        }

        if (element > maxElement) {         // If new number is greater than maxElement
            stack.push(2 * element - maxElement);
            maxElement = element;
        } else                              // If new number is less than maxElement
            stack.push(element);

        System.out.print("Number inserted: " + element + "\n");
    }

    void removeLast() {
        if (stack.empty()) {

            System.out.print("Stack is empty\n");
            return;
        }

        System.out.print("Top element removed: ");
        int topElement = stack.peek();
        stack.pop();


        if (topElement > maxElement) {      // Maximum will change as the maximum element of the stack is being removed.
            System.out.print(maxElement + "\n");
            maxElement = 2 * maxElement - topElement;
        } else
            System.out.println(topElement + "\n");
    }

    void getLast() {
        if (stack.empty()) {

            System.out.println("Stack is empty ");
            return;
        }

        int topElement = stack.peek();      // Top element. getLast()

        System.out.print("Top element is: ");

        if (topElement > maxElement)        // If t < maxElement means maxElement stores value of t.
            System.out.println(maxElement);
        else
            System.out.println(topElement);
    }

    void size() {
        System.out.print("Stack size is: ");
        System.out.println(stack.size());
    }
}
