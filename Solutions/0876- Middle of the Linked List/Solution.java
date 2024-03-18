class Solution {
    public ListNode middleNode(ListNode head) {
        var slow = head;
        var fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return fast.next != null ? slow.next : slow;
    }
}