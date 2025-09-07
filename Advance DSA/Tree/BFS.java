public class BFS {
    public static Node createSampleTree() {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        return root;
    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.err.println(root.data);
        inorder(root.right);
    }

    public static void main(String[] args) {
        Node root = createSampleTree();

        inorder(root);
    }
}
