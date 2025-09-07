public class T_implementation {
    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(2);
        root.right = new Node(8);

        root = root.left;
        System.out.println(root.data);
        System.out.println(root.right.data);
        System.out.println(root.left.data);
    }
}
