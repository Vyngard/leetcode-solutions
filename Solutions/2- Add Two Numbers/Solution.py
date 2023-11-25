# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def addTwoNumbers(self, l1, l2):
        result = ListNode()
        number1 = number2 = carry = 0
        current = result
        while l1 is not None or l2 is not None or carry != 0:
            if current.next is None:
                current.next = ListNode()
                current = current.next

            number1 = 0 if l1 is None else l1.val
            number2 = 0 if l2 is None else l2.val
            sum = number1 + number2 + carry

            carry = sum // 10
            current.val = sum % 10

            l1 = None if l1 is None else l1.next
            l2 = None if l2 is None else l2.next

        return result.next
