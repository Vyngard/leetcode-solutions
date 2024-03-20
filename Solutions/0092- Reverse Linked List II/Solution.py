class Solution:
    def reverseBetween(self, head: Optional[ListNode], left: int, right: int) -> Optional[ListNode]:
        dummy = ListNode()
        dummy.next = head
        
        pointer1 = dummy
        pointer2 = dummy
        count = right - left

        # Move pointer1 to the node just before the start of the reversal segment
        for _ in range(left - 1):
            pointer1 = pointer1.next

        # Move pointer2 to the node right after the end of the reversal segment
        for _ in range(right + 1):
            pointer2 = pointer2.next

        # Detach the segment to reverse
        tempList = pointer1.next
        pointer1.next = None
        pointer3 = tempList

        while count > 0:
            pointer3 = pointer3.next
            count -= 1
        end_of_reversed_segment = pointer3.next
        pointer3.next = None  # Mark the end of the segment to reverse

        # Reverse the detached segment
        prev = None
        current = tempList
        while current is not None:
            next_temp = current.next
            current.next = prev
            prev = current
            current = next_temp

        # Connect the reversed segment back into the list
        pointer1.next = prev
        tempList.next = pointer2

        return dummy.next