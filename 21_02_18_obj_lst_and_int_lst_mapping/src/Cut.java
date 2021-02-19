public class Cut {

    int left;
    int right;

    public Cut(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public int getLeft() {
        return left;
    }

    public int getRight() {
        return right;
    }

    @Override
    public String toString() {
        return "Cut{" +
                "left=" + left +
                ", right=" + right +
                '}';
    }

}
