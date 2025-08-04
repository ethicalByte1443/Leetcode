public class insertionLL {

    public static Node insertHead(Node head, int k) {
        Node newNode = new Node(k, null);
        newNode.next = head;
        head = newNode;
        return head;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        Node head = new Node(arr[0]);
        Node ans = head;
        for (int i = 1; i < arr.length; i++) {
            Node current = new Node(arr[i]);
            ans.next = current;
            ans = ans.next;
        }

        head = insertHead(head, 0);

        LL.print(head);

        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }

        System.out.println(current.val);
    }
}
