public class insertionDLL {
    public static Node insertHead(Node head, int val){
        Node newHead = new Node(val);
        newHead.next = head;
        head.prev = newHead;
        head = newHead;
        return head;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};

        Node head = new Node(arr[0]);
        Node ans = head;
        for (int i = 1; i < arr.length; i++) {
            Node newNode = new Node(arr[i]);
            ans.next = newNode;
            newNode.prev = ans;
            ans = ans.next;
        }
        head = insertHead(head, 0);
        LL.print(head);
        DLL.printBack(head);
    }
}
