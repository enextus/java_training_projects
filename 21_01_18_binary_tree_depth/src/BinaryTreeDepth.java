public class BinaryTreeDepth {

    public int heightTree(Node node) {
        if (node == null)
            return -1;

        int left = heightTree(node.left);
        int right = heightTree(node.right);

        return 1 + Math.max(left, right);
    }
}
