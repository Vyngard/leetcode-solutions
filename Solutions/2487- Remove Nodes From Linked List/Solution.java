class Solution {
    public ListNode removeNodes(ListNode head) {
        Deque<Integer> stack = new ArrayDeque<>();
        var current = head;

        while (current != null) {
            while (!stack.isEmpty() && current.val > stack.peek()) {
                stack.pop();
            }
            stack.push(current.val);
            current = current.next;
        }
        ListNode answer = new ListNode();
        current = answer;
        while (!stack.isEmpty()) {
            current.next = new ListNode(stack.removeLast());
            current = current.next;
        }
        return answer.next;
    }

}