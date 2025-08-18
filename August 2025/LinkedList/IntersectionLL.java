import java.util.Map;
import java.util.LinkedHashMap;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class IntersectionLL{
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Map<Integer, Integer> map = new LinkedHashMap<>();

        ListNode temp = headA;
        while (temp != null) {
            if (map.containsKey(temp.val)) {
                map.put(temp.val, map.get(temp.val) + 1);
            } else {
                map.put(temp.val, 1);
            }
            temp = temp.next;   // ✅ you missed this
        }

        temp = headB;
        while (temp != null) {
            if (map.containsKey(temp.val)) {
                ListNode result = temp;
                while (temp != null && map.containsKey(temp.val)) {
                    map.put(temp.val, map.get(temp.val) + 1);
                    temp = temp.next;
                }
                if (temp == null) {
                    return result;
                }
            } else {
                map.put(temp.val, 1);
                temp = temp.next;   // ✅ move forward here too
            }
        }
        return null;
    }
    public static void main(String[] args) {
        // Shared part: 8 → 9 → 10
        ListNode intersect = new ListNode(8);
        intersect.next = new ListNode(9);
        intersect.next.next = new ListNode(10);

        // List A: 1 → 2 → [8 → 9 → 10]
        ListNode headA = new ListNode(1);
        headA.next = new ListNode(2);
        headA.next.next = intersect;

        // List B: 3 → 4 → [8 → 9 → 10]
        ListNode headB = new ListNode(3);
        headB.next = new ListNode(4);
        headB.next.next = intersect;
        ListNode ans = getIntersectionNode(headA, headB);

        if (ans != null) {
            System.out.println("Intersection at node with value: " + ans.val);
        } else {
            System.out.println("No intersection");
        }
    }
}
