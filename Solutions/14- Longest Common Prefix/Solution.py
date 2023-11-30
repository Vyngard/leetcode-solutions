class Solution:
    def longestCommonPrefix(self, strs: [str]) -> str:
        if len(strs) == 1:
            return strs[0]

        if not strs[0]:
            return ""

        for i in range(0,len(strs[0])):
            for j in range(1, len(strs)):
                if not strs[j]:
                    return ""

                if i >= len(strs[j]) or strs[j][i] != strs[0][i]:
                    return strs[0][:i]


        return strs[0]
