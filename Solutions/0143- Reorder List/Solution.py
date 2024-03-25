class Solution:
    def reorderList(self, head):
        if not head or not head.next:
            return
        
        # Split the list into two halves
        slow, fast = head, head
        while fast.next and fast.next.next:
            slow = slow.next
            fast = fast.next.next
        
        second_half = slow.next
        slow.next = None

        # Reverse the second half
        prev = None
        current = second_half
        while current:
            temp = current.next
            current.next = prev
            prev = current
            current = temp
        
        # Merge the two halves
        first_half, second_half = head, prev
        while second_half:
            temp1, temp2 = first_half.next, second_half.next
            first_half.next = second_half
            second_half.next = temp1
            first_half, second_half = temp1, temp2