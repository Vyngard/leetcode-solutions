class Solution:
    def partition(self, head: Optional[ListNode], x: int) -> Optional[ListNode]:
        first = ListNode()
        firstListPointer = first

        second = ListNode()
        secondListPointer = second

        current = head

        while current:
            if current.val < x:
                firstListPointer.next = current
                firstListPointer = firstListPointer.next
            else:
                secondListPointer.next = current
                secondListPointer = secondListPointer.next

            current = current.next

        secondListPointer.next = None
        firstListPointer.next = second.next

        return first.next