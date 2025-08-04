public class deletionLL {
    public static Node deleteHead(Node head) {
        head = head.next;
        return head;
    }

    public static Node deleteTail(Node head) {
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }

        current.next = null;
        return head;
    }

    public static Node deleteNode(Node head, int k) {
        if (head == null)
            return null;
        Node current = head;
        while (current != null) {
            if (current.next != null && current.next.val == k) {
                current.next = current.next.next;
                return head;
            }
            current = current.next;
        }
        return head;
    }

    public static void print(Node head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        Node head = new Node(arr[0]);
        Node current = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            current.next = temp;
            current = current.next;
        }

        // while (head != null) {
        // System.out.print(head.val + " -> ");
        // head = head.next;
        // }
        // System.out.println("null");

        // head = deleteHead(head);
        // head = deleteTail(head);

        head = deleteNode(head, 5);

        print(head);

    }
}
