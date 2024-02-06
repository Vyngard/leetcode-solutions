class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False

        dictionary = dict()

        for i in range(0, len(s)):
            s_char = s[i]
            t_char = t[i]

            if s_char not in dictionary:
                if t_char not in dictionary.values():
                    dictionary[s_char] = t_char
                else:
                    return False
            else:
                if dictionary[s_char] != t_char:
                    return False

        return True