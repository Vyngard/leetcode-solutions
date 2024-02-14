class Solution:
    def isHappy(self, n: int) -> bool:
        my_set = set()

        while n != 1 and n not in my_set:
            my_set.add(n)
            temp = 0
            while (n != 0):
                temp += pow((n % 10), 2)
                n //= 10
            n = temp

        return n == 1
        