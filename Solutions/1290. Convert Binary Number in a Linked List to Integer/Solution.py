class Solution:
    def getDecimalValue(self, head: ListNode) -> int:
        temp = ""
        current = head

        while current is not None:
            temp += str(current.val)
            current = current.next
        
        return int(temp, 2)