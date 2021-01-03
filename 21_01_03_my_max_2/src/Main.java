public class Main {

    public static void main(String[] args) {

        MyStack myStack = new MyStack();

        System.out.println(myStack.getLast());
        System.out.println(myStack.getMax());
        System.out.println(myStack.size());

        System.out.println();

        System.out.println(myStack.addLast(5));
        System.out.println(myStack.getLast());
        System.out.println(myStack.getMax());
        System.out.println(myStack.size());

        System.out.println();

        System.out.println(myStack.addLast(30));
        System.out.println(myStack.getLast());
        System.out.println(myStack.getMax());
        System.out.println(myStack.size());

        System.out.println();

        System.out.println(myStack.addLast(3));
        System.out.println(myStack.getLast());
        System.out.println(myStack.getMax());
        System.out.println(myStack.size());

        System.out.println();

        System.out.println(myStack.addLast(2));
        System.out.println(myStack.getLast());
        System.out.println(myStack.getMax());
        System.out.println(myStack.size());

        System.out.println();

        System.out.println(myStack.addLast(266));
        System.out.println(myStack.getLast());
        System.out.println(myStack.getMax());
        System.out.println(myStack.size());

        System.out.println();

        System.out.println(myStack.removeLast());
        System.out.println(myStack.getLast());
        System.out.println(myStack.getMax());
        System.out.println(myStack.size());

        System.out.println();

        System.out.println(myStack.removeLast());
        System.out.println(myStack.getLast());
        System.out.println(myStack.getMax());
        System.out.println(myStack.size());

        System.out.println();
    }
}
