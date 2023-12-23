public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        var current_a = headA;
        var current_b = headB;

        while (current_a != current_b) {
            if (current_a == null) {
                current_a = headB;
            } else {
                current_a = current_a.next;
            }

            if (current_b == null) {
                current_b = headA;
            } else {
                current_b = current_b.next;
            }

        }

        return current_a;
    }
}