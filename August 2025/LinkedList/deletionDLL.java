public class deletionDLL{
    public static Node deleteNode(Node head, int x) {
        // code here
        int count = 1;
        if (x == 1) {
            if (head == null) return null;
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            return head;
        }
        Node current = head;
        while(current != null && count + 1 != x){
            current = current.next;
            count++;
        }
        System.out.println(current.val);
        
        if (current != null && current.next != null) {
            if (current.next.next != null) {
                current.next = current.next.next;
                current.next.prev = current;
            } else {
                current.next = null;
            }   
        }
        
        return head;
    }
    public static void main(String[] args) {
        int arr[] = {41, 67, 34, 0, 69, 24, 78, 58, 62, 64, 5, 45};
        Node head = new Node(arr[0]);
        Node ans = head;
        for (int i = 1; i < arr.length; i++) {
            Node newNode = new Node(arr[i]);
            ans.next = newNode;
            newNode.prev = ans;
            ans = ans.next;
        }

        LL.print(head);

        head =  deleteNode(head, 2);

        DLL.printBack(head);
    }
}