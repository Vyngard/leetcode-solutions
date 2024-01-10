class Solution {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode answer = new ListNode();
        var current = answer;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int result1, result2;

            if (l1 == null)
                result1 = 0;
            else {
                result1 = l1.val;
                l1 = l1.next;
            }


            if (l2 == null)
                result2 = 0;
            else {
                result2 = l2.val;
                l2 = l2.next;
            }

            int temp = result1 + result2 + carry;
            carry = temp / 10;
            temp %= 10;

            current.next = new ListNode(temp);
            current = current.next;

        }

        return answer.next;
    }
}