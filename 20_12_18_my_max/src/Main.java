public class Main {

    public static void main(String[] args) {

        MyStack myStack = new MyStack();

        myStack.push(144);
        myStack.push(44);
        myStack.push(77);
        myStack.push(7);
        myStack.push(44);
        myStack.push(34);
        myStack.push(344);

        myStack.push(3);
        myStack.push(5);
        myStack.getMax();

        System.out.println();

        myStack.push(7);
        myStack.push(19);
        myStack.push(60);
        myStack.getMax();

        System.out.println();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.getMax();

        System.out.println();

        // myStack.pop();
        // myStack.peek();
    }
}

// getLast()
// removeLast()
// addLast()
// https://www.geeksforgeeks.org/find-maximum-in-a-stack-in-o1-time-and-o1-extra-space/
