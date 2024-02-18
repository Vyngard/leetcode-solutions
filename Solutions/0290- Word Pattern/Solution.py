class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        my_dict = dict()
        s = s.split(" ")

        if len(pattern) != len(s):
            return False

        for i in range(0, len(s)):
            if pattern[i] not in my_dict:
                if s[i] in my_dict.values():
                    return False
                my_dict[pattern[i]] = s[i]
            else:
                if my_dict[pattern[i]] != s[i]:
                    return False

        return True