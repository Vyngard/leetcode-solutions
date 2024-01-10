from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def removeElements(self, head: Optional[ListNode], val: int) -> Optional[ListNode]:
        current = head
        previous = None
        newHead = head

        while current is not None:
            if current.val == val:
                if previous is not None:
                    previous.next = current.next
                    current = current.next
                else:
                    newHead = current.next
                    current = current.next
            else:
                previous = current
                current = current.next


        return newHead


