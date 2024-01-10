class Solution:
    def getIntersectionNode(self, headA: ListNode, headB: ListNode) -> Optional[ListNode]:
        current_a = headA
        current_b = headB

        while current_a != current_b:
            if current_a is None:
                current_a = headB
            else:
                current_a = current_a.next

            if current_b is None:
                current_b = headA
            else:
                current_b = current_b.next

        return current_a
