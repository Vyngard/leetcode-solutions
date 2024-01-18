class Solution {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode();
        var first = head;
        var second = head;
        var current = dummy;

        while (first != null && first.next != null) {
            second = first.next;
            var temp = second.next;
            
            current.next = second;
            second.next = first;
            first.next = null;
            current = current.next.next;
            
            first = temp;
        }

        if (first != null)
            current.next = first;
        

        return dummy.next;
    }
}