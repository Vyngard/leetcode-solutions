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
        var first = dummy;
        var second = dummy;

        while (n > 0) {
            second = second.next;
            n--;
        }

        while(second.next != null) {
            first = first.next;
            second = second.next;
        }

        first.next = first.next.next;

        return dummy.next;

    }
}