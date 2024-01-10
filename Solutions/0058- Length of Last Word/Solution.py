class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        right = len(s) - 1
        size = 0

        while s[right] == ' ':
            right -= 1

        while right >=0 and s[right] != ' ':
            size += 1
            right -= 1

        return size