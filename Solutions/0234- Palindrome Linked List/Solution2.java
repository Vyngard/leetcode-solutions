import java.util.ArrayList;

class Solution {
    public boolean isPalindrome(ListNode head) {
        var slow = head;
        var fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode secondHalf = slow.next;
        slow.next = null;

        var current = secondHalf;
        ListNode secondHalfReversed = new ListNode();

        while (current != null) {
            var temp = current.next;
            current.next = secondHalfReversed.next;
            secondHalfReversed.next = current;
            current = temp;
        }

        var pointer1 = head;
        var pointer2 = secondHalfReversed.next;

        while (pointer1 != null && pointer2 != null) {
            if (pointer1.val != pointer2.val)
                return false;
            pointer1 = pointer1.next;
            pointer2 = pointer2.next;
        }

        return true;

    }

}