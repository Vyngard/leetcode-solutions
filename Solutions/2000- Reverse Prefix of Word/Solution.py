class Solution(object):
    def reversePrefix(self, word, ch):
        index = word.find(ch)

        if index == -1:
            return word
        else:
            return word[index::-1] + word[index+1:]