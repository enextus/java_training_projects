public class App {
    public static void main(String[] args) {

        Node node_1 = new Node(null, null);
        Node node_3 = new Node(null, null);
        Node node_7 = new Node(null, null);
        Node node_9 = new Node(null, null);
        Node node_8 = new Node(node_9, null);
        Node node_6 = new Node(node_7, node_8);
        Node node_5 = new Node(null, node_6);
        Node node_2 = new Node(node_1, node_3);
        Node node_4 = new Node(node_2, node_5);

        BinaryTreeDepth binaryTreeDepth = new BinaryTreeDepth();

        System.out.println("node_4.left: " + node_4.left + ", node_4.right: " + node_4.right);

        System.out.println("node_2.left: " + node_2.left + ", node_2.right: " + node_2.right);
        System.out.println("node_1.left: " + node_1.left + ", node_1.right: " + node_1.right);
        System.out.println("node_3.left: " + node_3.left + ", node_3.right: " + node_3.right);

        System.out.println("node_5.left: " + node_5.left + ", node_5.right: " + node_5.right);
        System.out.println("node_6.left: " + node_6.left + ", node_6.right: " + node_6.right);
        System.out.println("node_7.left: " + node_7.left + ", node_7.right: " + node_7.right);
        System.out.println("node_8.left: " + node_8.left + ", node_8.right: " + node_8.right);
        System.out.println("node_9.left: " + node_9.left + ", node_9.right: " + node_9.right);

        System.out.println("\nBinaryTreeDepth: " + binaryTreeDepth.heightTree(node_4));
    }
}
