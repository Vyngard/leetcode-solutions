class Solution {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy = new ListNode();

        for (var list : lists) {
            var pointer = list;
            var current = dummy;
            while (pointer != null) {
                if (current.next == null) {
                    current.next = pointer;
                    current = current.next;
                    pointer = pointer.next; // first change the pointer
                    current.next = null; // then set the next to null, otherwise the pointer will be null as well
                } else if (current.next.val < pointer.val) {
                    current = current.next;
                } else {
                    var temp = current.next;
                    current.next = pointer;
                    pointer = pointer.next; // first change the pointer
                    current.next.next = temp; // then set the current.next.next to temp otherwise the pointer will have the same value as temp and it create a loop
                }
            }
        }

        return dummy.next;
    }
}