class Solution:
    def countAndSay(self, n: int) -> str:
        if n == 1:
            return "1"
        
        number = self.countAndSay(n-1)
        index = 0
        answer = ""

        while (index < len(number)):
            temp = number[index]
            count = 0
            while (index < len(number) and number[index] == temp):
                index += 1
                count += 1
            answer += str(count)
            answer += str(temp)
        
        return answer
        