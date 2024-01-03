class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode first = new ListNode();
        var firstListPointer = first;

        ListNode second = new ListNode();
        var secondListPointer = second;

        var current = head;

        while (current != null) {
            if (current.val < x ) {
                firstListPointer.next = current;
                firstListPointer = firstListPointer.next;
            } else {
                secondListPointer.next = current;
                secondListPointer = secondListPointer.next;
            }
            current = current.next;
        }
        
        secondListPointer.next = null;
        firstListPointer.next = second.next;

        return first.next;
    }
}