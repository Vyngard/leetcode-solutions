import java.util.PriorityQueue;

class Solution {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);

        for (var head : lists) {
            if (head != null)
                pq.add(head);
        }

        ListNode dummy = new ListNode();
        var current = dummy;

        while (!pq.isEmpty()) {
            var node = pq.poll();
            if (node.next != null)
                pq.add(node.next);

            current.next = node;
            current = current.next;
        }

        return dummy.next;
    }
}