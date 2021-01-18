public class BinaryTree {

    int height(Node root) {
        if (root == null) {
            return 0;
        } else {
            int left = height(root.left);
            int right = height(root.right);
            if (left > right) {
                return 1 + left;
            } else {
                return 1 + right;
            }
        }
    }
}
