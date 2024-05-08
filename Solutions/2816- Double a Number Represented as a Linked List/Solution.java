class Solution {
    public ListNode doubleIt(ListNode head) {
        head = reverseList(head);
        ListNode dummy = new ListNode();
        ListNode current = dummy;
        int carry = 0;

        while (head != null) {
            int number = head.val;
            number = number * 2 + carry;
            carry = number / 10;
            number %= 10;
            current.next = new ListNode(number);
            current = current.next;
            head = head.next;
        }

        if (carry == 1) {
            current.next = new ListNode(1);
        }

        return reverseList(dummy.next);


    }

    private ListNode reverseList(ListNode head) {
        ListNode dummy = new ListNode();
        ListNode current = head;

        while (current != null) {
            ListNode temp = current.next;

            current.next = dummy.next;
            dummy.next = current;

            current = temp;
        }

        return dummy.next;
    }
}