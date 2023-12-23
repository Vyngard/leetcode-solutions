class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode newList = new ListNode();
        var pointer = newList;
        var current = head;
        var next = head;

        while (current != null && current.next != null) {
            next = current.next;
            var reserve = next.next;

            current.next = null;
            next.next = current;
            pointer.next = next;
            pointer = pointer.next.next;

            current = reserve;

        }

        if (current != null) {
            pointer.next = current;
        }



        return newList.next;
    }
}