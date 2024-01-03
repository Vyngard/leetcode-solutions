class Solution:
    def deleteDuplicates(self, head: Optional[ListNode]) -> Optional[ListNode]:
        dummy = ListNode()
        dummy.next = head

        previous = dummy
        current = head

        while current:
            while current.next and current.next.val == current.val:
                current = current.next

            if previous.next == current:
                previous = current
            else:
                previous.next = current.next

            current = current.next

        return dummy.next