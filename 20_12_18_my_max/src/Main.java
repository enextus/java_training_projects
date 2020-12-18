public class Main {
    /**
     * Get the current line number.
     *
     * @return int - Current line number.
     */
    public static int getLineNumber() {
        return Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    public static void main(String[] args) {

        GFG.MyStack s = new GFG.MyStack();
        s.push(3);
        s.push(5);
        System.out.println(getLineNumber());
        s.getMax();

        s.push(7);
        s.push(19);
        System.out.println(getLineNumber());
        s.getMax();

        System.out.println(getLineNumber());
        s.pop();
        System.out.println(getLineNumber());
        s.getMax();

        System.out.println(getLineNumber());
        s.pop();

        System.out.println(getLineNumber());
        s.peek();
    }
}
