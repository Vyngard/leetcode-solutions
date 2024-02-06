import java.util.List;

class Solution {

    public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

    public ListNode reverseList(ListNode head) {

        ListNode dummy = new ListNode();
        var current = head;

        while (current != null) {
            var temp = current.next;

            current.next = dummy.next;
            dummy.next = current;
            
            current = temp;
        }
        
        return dummy.next;

    }
}
