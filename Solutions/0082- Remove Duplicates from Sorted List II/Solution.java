class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode();
        dummy.next = head;

        var previous = dummy;
        var current = head;

        while (current != null) {
            while (current.next != null && current.next.val == current.val) {
                current = current.next;
            }

            if (previous.next == current) {
                previous = current;
            } else {
                previous.next = current.next;
            }

            current = current.next;

        }

        return dummy.next;
    }
}