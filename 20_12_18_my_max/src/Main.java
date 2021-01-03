public class Main {

    public static void main(String[] args) {

        MyStack myStack = new MyStack();

        myStack.addLast(5);
        myStack.getLast();
        myStack.getMax();
        myStack.size();

        System.out.println();

        myStack.addLast(30);
        myStack.getLast();
        myStack.getMax();
        myStack.size();

        System.out.println();
    }
}
