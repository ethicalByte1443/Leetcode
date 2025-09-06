public class Node{
    int data;
    Node left;
    Node right;

    public Node(int key){
        this.data = key;
    }

    public Node(int key, Node left, Node right){
        this.data = key;
        this.left = left;
        this.right = right;
    }
}