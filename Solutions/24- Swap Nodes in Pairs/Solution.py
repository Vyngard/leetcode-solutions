class Solution:
    def swapPairs(self, head: Optional[ListNode]) -> Optional[ListNode]:
        newList = ListNode()

        pointer = newList
        current = head
        next = head

        while current and current.next:
            next = current.next
            reserve = next.next

            current.next = None
            next.next = current
            pointer.next = next
            pointer = pointer.next.next

            current = reserve

        if current:
            pointer.next = current

        return newList.next