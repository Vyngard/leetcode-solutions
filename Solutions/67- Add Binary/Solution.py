class Solution:
    def addBinary(self, a: str, b: str) -> str:
        shorter, longer = (a, b) if len(a) <= len(b) else (b, a)
        shorterPointer = len(shorter) - 1
        longerPointer = len(longer) - 1
        carry = 0
        answer = []

        while shorterPointer >= 0:
            if shorter[shorterPointer] == '1' and longer[longerPointer] == '1':
                if carry == 0:
                    answer.append("0")
                    carry = 1
                else:
                    answer.append("1")
            elif shorter[shorterPointer] == '0' and longer[longerPointer] == '0':
                if carry == 0:
                    answer.append("0")
                else:
                    answer.append("1")
                    carry = 0
            else:
                if carry == 0:
                    answer.append("1")
                else:
                    answer.append("0")
            shorterPointer -= 1
            longerPointer -= 1

        while longerPointer >= 0:
            if longer[longerPointer] == '1':
                if carry == 0:
                    answer.append("1")
                else:
                    answer.append("0")
            else:
                if carry == 0:
                    answer.append("0")
                else:
                    answer.append("1")
                    carry = 0
            longerPointer -= 1

        if carry == 1:
            answer.append("1")

        return ''.join(reversed(answer))