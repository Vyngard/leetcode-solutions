class Solution {
    
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        var pointer1 = list1;
        var pointer2 = list2;
        var pointer = dummy;

        while (pointer1 != null) {
            if (pointer2 != null) {
                if (pointer1.val <= pointer2.val) {
                    pointer.next = pointer1;
                    pointer1 = pointer1.next;
                } else {
                    pointer.next = pointer2;
                    pointer2 = pointer2.next;
                }
            } else {
                pointer.next = pointer1;
                pointer1 = pointer1.next;
            }
            pointer = pointer.next;
        }

        while (pointer2 != null) {
            pointer.next = pointer2;
            pointer = pointer.next;
            pointer2 = pointer2.next;
        }

        return dummy.next;
    }
}