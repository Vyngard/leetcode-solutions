public class Solution {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode AddTwoNumbers(ListNode l1, ListNode l2) {
        int number1, number2, carry = 0;
        ListNode result = new ListNode();
        var current = result;
        while (l1 != null || l2 != null || carry != 0) {
            if (current.next == null) {
                current.next = new ListNode();
                current = current.next;
            }

            number1 = l1 == null ? 0 : l1.val;
            number2 = l2 == null ? 0 : l2.val;
            int sum = number1 + number2 + carry;

            carry = sum / 10;
            current.val = sum % 10;

            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }

        return result.next;

    }
}