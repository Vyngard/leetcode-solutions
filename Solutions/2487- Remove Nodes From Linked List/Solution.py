class Solution:
    def removeNodes(self, head: Optional[ListNode]) -> Optional[ListNode]:
        stack = []
        current = head

        while current is not None:
            while stack and current.val > stack[-1]:
                stack.pop()
            stack.append(current.val)
            current = current.next

        dummy = ListNode()
        current = dummy
        for val in stack:
            current.next = ListNode(val)
            current = current.next

        return dummy.next