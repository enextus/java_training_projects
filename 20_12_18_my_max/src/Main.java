public class Main {
    public static void main(String[] args) {

        GFG.MyStack s = new GFG.MyStack();
        s.push(3);
        s.push(5);
        s.getMax();
        s.push(7);
        s.push(19);
        s.getMax();
        s.pop();
        s.getMax();
        s.pop();
        s.peek();
    }
}
