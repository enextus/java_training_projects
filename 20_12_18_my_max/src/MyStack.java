import java.util.Stack;

class GFG {
    // A user defined stack that supports getMax() in addition to push() and pop()
    static class MyStack {

        Stack<Integer> stack = new Stack<Integer>();
        int maxEle;

        // getMax()
        // Get maximum element of MyStack
        void getMax() {
            if (stack.empty())
                System.out.print("Stack is empty\n");

                // variable maxEle stores the maximum element
                // in the stack.
            else
                System.out.print("Element with bigiest value" +
                        ": " + maxEle + "\n");
        }

        // getLast()
        // Get top element of MyStack
        // The method returns the element at the top of the Stack
        // else returns NULL if the Stack is empty.
        void peek() {
            if (stack.empty()) {

                System.out.print("Stack is empty ");
                return;
            }

            int topElement = stack.peek(); // Top element. getLast()

            System.out.print("Top element is: ");

            // If t < maxEle means maxEle stores value of t.
            if (topElement > maxEle)
                System.out.print(maxEle);
            else
                System.out.print(topElement);
        }

        // removeLast()
        // Remove the top element from MyStack
        void pop() {
            if (stack.empty()) {
                System.out.print("Stack is empty\n");
                return;
            }

            System.out.print("Top element removed: ");
            int topElement = stack.peek();
            stack.pop();

            // Maximum will change as the maximum element of the stack is being removed.
            if (topElement > maxEle) {
                System.out.print(maxEle + "\n");
                maxEle = 2 * maxEle - topElement;
            } else
                System.out.println(topElement + "\n");
        }

        // addLast()
        // The push(Object item) method is used to pushes an item onto the top of this stack.
        void push(int x) {
            // Insert new number into the stack
            if (stack.empty()) {
                maxEle = x;
                stack.push(x);
                System.out.print("Number inserted: " + x + "\n");
                return;
            }

            // If new number is greater than maxEle
            if (x > maxEle) {
                stack.push(2 * x - maxEle);
                maxEle = x;
            } else // If new number is less than maxEle
                stack.push(x);

            System.out.print("Number inserted: " + x + "\n");
        }
    }
}
