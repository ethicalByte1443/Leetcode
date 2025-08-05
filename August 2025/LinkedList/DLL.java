class Node{
    int val;
    Node next;
    Node prev;

    Node(int val){
        this.val = val;
        this.next = null;
        this.prev = null;
    }
}
public class DLL {
    public static void printBack(Node head){
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        Node tail = current;
        current = tail;
        while(current != null){
            System.out.print(current.val + " -> ");
            current = current.prev;
        }
        System.out.println("null");
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


        DLL.printBack(ans);
        
    }
}
