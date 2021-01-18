public class BinaryTreeDepth {

    int heightTree(Node root) {
        if (root == null)
            return -1;

        int left = heightTree(root.left);
        int right = heightTree(root.right);

        if (left > right)
            return left + 1;
        else
            return right + 1;
    }
}
