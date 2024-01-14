class Solution:
    def intToRoman(self, num: int) -> str:
        roman = ["M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"]
        number = [1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1]
        index = 0
        answer = ""

        while num > 0:
            if num // number[index] > 0:
                answer = answer + roman[index]
                num -= number[index]
            else:
                index += 1

        return answer