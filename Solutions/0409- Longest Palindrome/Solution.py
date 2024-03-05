class Solution:
    def longestPalindrome(self, s: str) -> int:
        count = 0
        my_set = set()

        for ch in s:
            if ch not in my_set:
                my_set.add(ch)
            else:
                my_set.remove(ch)
                count += 2

        return count + 1 if my_set else count