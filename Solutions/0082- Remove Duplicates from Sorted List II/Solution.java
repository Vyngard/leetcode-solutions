class Solution {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-200);
        var current = head;
        var pointer = dummy;

        while (current != null) {
            if (current.val != current.next.val) {
                pointer.next = current;
                current = current.next;
                pointer = pointer.next;
            } else {
                int number = current.val;
                while (current.val == number) {
                    current = current.next;
                }
            }

        }

        return dummy.next;
    }

}