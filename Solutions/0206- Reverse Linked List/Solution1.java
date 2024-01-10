import java.util.List;

class Solution {

    public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

    public ListNode reverseList(ListNode head) {

        ListNode newList = new ListNode();
        var current = head;

        while (current != null) {
            var next = current.next;
            current.next = newList.next;
            newList.next = current;
            current = next;
        }

        return newList.next;

    }
}