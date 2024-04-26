class Solution:
    def selfDividingNumbers(self, left: int, right: int) -> List[int]:
        answer = list()

        for i in range(left,right+1):
            number = i
            selfDiving = True

            while number > 0:
                remainder = number % 10
                if remainder == 0 or i % remainder != 0:
                    selfDiving = False
                    break
                number //= 10
            
            if selfDiving:
                answer.append(i)

        return answer
