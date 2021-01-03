public class Main {

    public static void main(String[] args) {

        MyStack myStack = new MyStack();

        myStack.addLast(0);
        myStack.getLast();
        myStack.getMax();
        myStack.size();

        System.out.println();

        myStack.addLast(144);
        myStack.getLast();
        myStack.getMax();
        myStack.size();

        System.out.println();

        myStack.addLast(2);
        myStack.getLast();
        myStack.getMax();
        myStack.size();

        System.out.println();

        myStack.addLast(2000);
        myStack.getLast();
        myStack.getMax();
        myStack.size();

        System.out.println();

        myStack.removeLast();
        myStack.getLast();
        myStack.getMax();
        myStack.size();

        System.out.println();

        myStack.removeLast();
        myStack.getLast();
        myStack.getMax();
        myStack.size();

        System.out.println();

        myStack.removeLast();
        myStack.getLast();
        myStack.getMax();
        myStack.size();

        System.out.println();

        myStack.removeLast();
        myStack.getLast();
        myStack.getMax();
        myStack.size();
    }
}
