class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        slow = head
        fast = head.next

        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next

        current = slow.next
        slow.next = None
        second_list = None

        while current:
            next_item = current.next
            current.next = None
            current.next = second_list
            second_list = current
            current = next_item

        while second_list:
            if second_list.val != head.val:
                return False
            second_list = second_list.next
            head = head.next


        return True