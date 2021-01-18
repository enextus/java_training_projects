public class BinaryTreeDepth {

    public int heightTree(Node node) {
        if (node == null)
            return -1;

        int left = heightTree(node.left);
        int right = heightTree(node.right);

        if (left > right)
            return left + 1;
        else
            return right + 1;
    }
}
