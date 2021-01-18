import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeVertexTest {
    Node node_7 = new Node(null, null);
    Node node_9 = new Node(null, null);
    Node node_8 = new Node(node_9, null);
    Node node_6 = new Node(node_7, node_8);
    Node node_5 = new Node(null, node_6);

    Node node_1 = new Node(null, null);
    Node node_3 = new Node(null, null);
    Node node_2 = new Node(node_1, node_3);
    Node node_4 = new Node(node_2, node_5);

    BinaryTreeVertex binaryTreeVertex = new BinaryTreeVertex();

    @Test
    void height_Test_node_4() {
        assertEquals(9, binaryTreeVertex.vertexCount(node_4));
    }

    @Test
    void height_Test_node_2() {
        assertEquals(3, binaryTreeVertex.vertexCount(node_2));
    }

    @Test
    void height_Test_node_1() {
        assertEquals(1, binaryTreeVertex.vertexCount(node_1));
    }

    @Test
    void height_Test_node_3() {
        assertEquals(1, binaryTreeVertex.vertexCount(node_3));
    }

    @Test
    void height_Test_node_5() {
        assertEquals(5, binaryTreeVertex.vertexCount(node_5));
    }

    @Test
    void height_Test_node_6() {
        assertEquals(4, binaryTreeVertex.vertexCount(node_6));
    }

    @Test
    void height_Test_node_7() {
        assertEquals(1, binaryTreeVertex.vertexCount(node_7));
    }

    @Test
    void height_Test_node_8() {
        assertEquals(2, binaryTreeVertex.vertexCount(node_8));
    }

    @Test
    void height_Test_node_9() {
        assertEquals(1, binaryTreeVertex.vertexCount(node_9));
    }
}
