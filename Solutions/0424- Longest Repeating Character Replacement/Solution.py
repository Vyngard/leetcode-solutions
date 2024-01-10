class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        if len(s) == 0:
            return 0

        left, right, longestLength = 0, 0, 0
        dict = {}

        while right < len(s):
            current = s[right]

            if current in dict:
                dict[current] += 1
            else:
                dict[current] = 1

            difference = (right - left + 1) - max(dict.values())

            if difference <= k:
                longestLength = max(longestLength, right - left + 1)
                right += 1
            else:
                dict[s[left]] -= 1
                left += 1
                right += 1

        return longestLength
