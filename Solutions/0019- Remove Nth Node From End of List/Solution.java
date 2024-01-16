class Solution {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode();
        dummy.next = head;

        int length = 0;
        var current = dummy;

        while (current.next != null) {
            current = current.next;
            length++;
        }

        length = length - n;

        current = dummy;

        while (length > 0) {
            current = current.next;
            length--;
        }
        if (current.next != null)
            current.next = current.next.next;

        return dummy.next;
    }
}