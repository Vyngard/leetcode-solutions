class Solution:
    def doubleIt(self, head: Optional[ListNode]) -> Optional[ListNode]:
        head = reverse_list(head)
        dummy = ListNode()
        current = dummy
        carry = 0

        while head is not None:
            number = head.val
            number = number * 2 + carry
            carry = number // 10
            number %= 10
            current.next = ListNode(number)
            current = current.next
            head = head.next

        if carry == 1:
            current.next = ListNode(1)

        return reverse_list(dummy.next)

def reverse_list(head):
    dummy = ListNode()
    current = head

    while current is not None:
        temp = current.next
        current.next = dummy.next
        dummy.next = current
        current = temp

    return dummy.next
        