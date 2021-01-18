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

        System.out.println(binaryTreeDepth.heightTree(node_4));
    }
}
