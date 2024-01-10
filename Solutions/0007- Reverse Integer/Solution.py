class Solution:
    def reverse(self, x: int) -> int:
        answer = 0
        max = 2 ** 31 - 1
        min = -(2 ** 31)
        z = x
        x = abs(x)

        while x != 0:
            if answer > max // 10 or answer < min // 10:
                return 0
            answer = (answer * 10) + (x % 10)
            x //= 10

        if z < 0:
            return -answer
        return answer