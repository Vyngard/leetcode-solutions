class Solution:
    def lemonadeChange(self, bills: List[int]) -> bool:
        five_counter = 0
        ten_counter = 0

        for bill in bills:
            if bill == 5:
                five_counter += 1
            elif bill == 10:
                if five_counter > 0:
                    five_counter -= 1
                    ten_counter += 1
                else:
                    return False
            else:
                if ten_counter > 0 and five_counter > 0:
                    five_counter -= 1
                    ten_counter -= 1
                elif five_counter >= 3:
                    five_counter -= 3
                else:
                    return False
        return True

        

