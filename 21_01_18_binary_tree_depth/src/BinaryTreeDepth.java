public class BinaryTreeDepth {

    int heightTree(Node root) {
        if (root == null)
            return -1;

        int left = heightTree(root.left);
        int right = heightTree(root.right);

        if (left > right)
            return 1 + left;
        else
            return 1 + right;
    }
}
