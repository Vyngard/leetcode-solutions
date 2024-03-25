/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        var slow = head;
        var fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode secondHalf = slow.next;
        slow.next = null;

        ListNode dummy = new ListNode();
        var current = secondHalf;

        while (current != null) {
            var temp = current.next;

            current.next = dummy.next;
            dummy.next = current;

            current = temp;
        }

        var pointer2 = dummy.next;
        var pointer1 = head;

        ListNode answer = new ListNode();
        var pointer3 = answer;

        while (pointer2 != null) {
            pointer3.next = pointer1;
            pointer3 = pointer3.next;
            pointer1 = pointer1.next;
            pointer3.next = null;

            pointer3.next = pointer2;
            pointer3 = pointer3.next;
            pointer2 = pointer2.next;
            pointer3.next = null;
        }

        if (pointer1 != null) {
            pointer3.next = pointer1;
        }

        head = answer.next;

    }
}