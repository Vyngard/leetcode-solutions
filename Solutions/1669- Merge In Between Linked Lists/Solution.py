class Solution:
    def mergeInBetween(self, list1: ListNode, a: int, b: int, list2: ListNode) -> ListNode:
        pointer1 = pointer2 = list1

        for _ in range(0,a-1):
            pointer1 = pointer1.next
        
        for _ in range(0,b):
            pointer2 = pointer2.next
        
        pointer1.next = list2
        while pointer1.next:
            pointer1 = pointer1.next
        
        pointer1.next = pointer2.next
        return list1