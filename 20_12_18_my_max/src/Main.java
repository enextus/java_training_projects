public class Main {

    public static void main(String[] args) {

        MyStack s = new MyStack();
        s.push(144);
        s.push(44);
        s.push(77);
        s.push(7);
        s.push(44);
        s.push(34);
        s.push(344);

        s.push(3);
        s.push(5);
        s.getMax();

        System.out.println();

        s.push(7);
        s.push(19);
        s.push(60);
        s.getMax();

        System.out.println();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.getMax();

        System.out.println();

        //s.pop();
        //s.peek();
    }
}


// getLast()
// removeLast()
// addLast()
// https://www.geeksforgeeks.org/find-maximum-in-a-stack-in-o1-time-and-o1-extra-space/