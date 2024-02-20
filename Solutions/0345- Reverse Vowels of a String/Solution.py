class Solution:
    def reverseVowels(self, s: str) -> str:
        vowels = set("aeiouAEIOU")
        s_list = list(s)
        left, right = 0, len(s) - 1
        
        while left < right:
            if s_list[left] in vowels:
                while right > left:
                    if s_list[right] in vowels:
                        s_list[left], s_list[right] = s_list[right], s_list[left]
                        right -= 1
                        break
                    right -= 1
            left += 1

        return ''.join(s_list)