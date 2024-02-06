class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        var currentNode = dummy;
        var nextNode = dummy.next;

        while (nextNode != null) {
            if (nextNode.val != val) {
                nextNode = nextNode.next;
                currentNode = currentNode.next;
            } else {
                while (nextNode != null && nextNode.val == val) {
                    nextNode = nextNode.next;
                }
                currentNode.next = nextNode;
            }
        }

        currentNode.next = nextNode;
        return dummy.next;
    }

}