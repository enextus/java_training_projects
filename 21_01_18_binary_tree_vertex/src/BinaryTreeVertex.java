public class BinaryTreeVertex {
    int vertexCount(Node root) {
        if (root == null)
            return 0;

        return vertexCount(root.left) + vertexCount(root.right) + 1;
    }
}
