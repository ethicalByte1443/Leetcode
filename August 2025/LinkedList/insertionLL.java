public class insertionLL {

    public static Node insertHead(Node head, int k) {
        Node newNode = new Node(k);
        newNode.next = head;
        head = newNode;
        return head;
    }

    public static Node insertTail(Node head, int val){
        Node current = head;
        while(current.next != null){
            current = current.next;
        }

        Node newNode = new Node(val);
        current.next = newNode;

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
        head = insertTail(head, 9);
        LL.print(head);

    }
}
