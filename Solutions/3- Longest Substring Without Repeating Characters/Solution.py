class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        my_set = set()
        maxCount = right = left = 0

        for ch in s:
            if ch not in my_set:
                right += 1
                my_set.add(ch)
            else:
                while left < right:
                    my_set.remove(s[left])
                    left += 1
                    if ch not in my_set:
                        right += 1
                        my_set.add(ch)
                        break


            maxCount = max(maxCount, right - left)

        return maxCount