import java.util.Stack;

class GFG {
    // A user defined stack that supports getMax() in
    // addition to push() and pop()
    static class MyStack {
        Stack<Integer> s = new Stack<Integer>();
        int maxEle;

        // Prints maximum element of MyStack
        void getMax() {
            if (s.empty())
                System.out.print("Stack is empty\n");

                // variable maxEle stores the maximum element
                // in the stack.
            else
                System.out.print("Maximum Element in" +
                        "the stack is: " + maxEle + "\n");

        }

        // Prints top element of MyStack
        void peek() {
            if (s.empty()) {

                System.out.print("Stack is empty ");
                return;
            }

            int t = s.peek(); // Top element.

            System.out.print("Top Most Element is: ");

            // If t < maxEle means maxEle stores
            // value of t.
            if (t > maxEle)
                System.out.print(maxEle);
            else
                System.out.print(t);
        }

        // Remove the top element from MyStack
        void pop() {
            if (s.empty()) {
                System.out.print("Stack is empty\n");
                return;
            }

            System.out.print("Top Most Element Removed: ");
            int t = s.peek();
            s.pop();

            // Maximum will change as the maximum element
            // of the stack is being removed.
            if (t > maxEle) {
                System.out.print(maxEle + "\n");
                maxEle = 2 * maxEle - t;
            } else
                System.out.print(t + "\n");
        }

        // Removes top element from MyStack
        void push(int x) {
            // Insert new number into the stack
            if (s.empty()) {
                maxEle = x;
                s.push(x);
                System.out.print("Number Inserted: " + x + "\n");
                return;
            }

            // If new number is less than maxEle
            if (x > maxEle) {
                s.push(2 * x - maxEle);
                maxEle = x;
            } else
                s.push(x);

            System.out.print("Number Inserted: " + x + "\n");
        }
    }
}
