    class Node{
        int val;
        Node next;

        Node(int val, Node next){
            this.val = val;
            this.next = next;
        }

        Node(int val){
            this.val = val;
            this.next = null;
        }
 

    }


    public class LL{
        public static void main(String[] args) {
            int arr[] = {1,2,3,4,5,6,7,8};
            Node head = new Node(arr[0]);
            Node ans = head;
            for (int i = 1; i < arr.length; i++) {
                Node current = new Node(arr[i]);
                ans.next = current;
                ans = ans.next;
            }

            while(head != null){
                System.out.print(head.val + " -> ");
                head = head.next;
            }
            System.out.println("null");
        }
    }