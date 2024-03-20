class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode();
        dummy.next = head;

        var pointer1 = dummy;
        var pointer2 = dummy;
        int count = right - left;

        // find the start of the list that has to be reversed
        while (left >= 2) {
            pointer1 = pointer1.next;
            left--;
        }

        // find the end of the list that has to be reversed
        while (right >= 0) {
            pointer2 = pointer2.next;
            right--;
        }

        // create a separate list of the list that has to be reversed
        ListNode tempList = pointer1.next;
        var pointer3 = tempList;

        while (count > 0) {
            pointer3 = pointer3.next;
            count--;
        }
        pointer3.next = null; // specify the end of the list that has to be reversed

        // reverse the list
        ListNode dummy2 = new ListNode();
        var current = tempList;

        while (current != null) {
            var temp = current.next;
            current.next = dummy2.next;
            dummy2.next = current;
            current = temp;
        }

        // connect the three lists together
        pointer1.next = dummy2.next;

        while (pointer1.next != null) {
            pointer1 = pointer1.next;
        }
        pointer1.next = pointer2;

        return dummy.next;

    }
}