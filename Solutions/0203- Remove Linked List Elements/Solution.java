import java.util.List;

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        var current = head;
        ListNode previous = null;
        var newHead = head;
        
        while(current != null) {
            if (current.val == val) {
                if (previous != null) {
                    previous.next = current.next;
                    current = current.next;
                } else {
                    newHead = current.next;
                    current = current.next;
                }
            } else {
                previous = current;
                current = current.next;
            }

        }

        return newHead;
    }
}