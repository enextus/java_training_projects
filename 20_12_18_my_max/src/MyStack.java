import java.util.Stack;

class GFG {
    // A user defined stack that supports getMax() in
    // addition to push() and pop()
    static class MyStack {

        Stack<Integer> s = new Stack<Integer>();
        int maxEle;

        // getMax()
        //
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

        // getLast()
        //
        // Prints top element of MyStack
        // The method returns the element at the top of the Stack
        // else returns NULL if the Stack is empty.
        void peek() {
            if (s.empty()) {

                System.out.print("Stack is empty ");
                return;
            }

            int t = s.peek(); // Top element. getLast()

            System.out.print("Top Most Element is: ");

            // If t < maxEle means maxEle stores value of t.
            if (t > maxEle)
                System.out.print(maxEle);
            else
                System.out.print(t);
        }

        // removeLast()
        //
        // Remove the top element from MyStack
        void pop() {
            if (s.empty()) {
                System.out.print("Stack is empty\n");
                return;
            }

            System.out.print("Top element removed: ");
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

        // addLast()
        //
        // The push(Object item) method is used to Pushes an item
        // onto the top of this stack.
        void push(int x) {
            // Insert new number into the stack
            if (s.empty()) {
                maxEle = x;
                s.push(x);
                System.out.print("Number inserted: " + x + "\n");
                return;
            }

            // If new number is greater than maxEle
            if (x > maxEle) {
                s.push(2 * x - maxEle);
                maxEle = x;
            } else // If new number is less than maxEle
                s.push(x);

            System.out.print("Number inserted: " + x + "\n");
        }
    }
}
