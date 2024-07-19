class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        number1 = number2 = 0
        current = l1
        offset = 1
        while current is not None:
            number1 += offset * current.val
            offset *= 10
            current = current.next

        current = l2
        offset = 1
        while current is not None:
            number2 += offset * current.val
            offset *= 10
            current = current.next

        answer = number1 + number2
        
        if answer == 0:
            return ListNode(0)
        
        dummy = ListNode(0)
        current = dummy
        while answer > 0:
            current.next = ListNode(answer % 10)
            answer //= 10
            current = current.next
        
        return dummy.next