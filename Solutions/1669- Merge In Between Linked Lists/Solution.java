class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        var pointer1 = list1;
        var pointer2 = list1;

        while (a > 1) {
            pointer1 = pointer1.next;
            a--;
        }

        while (b > 0) {
            pointer2 = pointer2.next;
            b--;
        }

        pointer1.next = list2;
        while (pointer1.next != null) {
            pointer1 = pointer1.next;
        }

        pointer1.next = pointer2.next;
        return list1;

    }
}