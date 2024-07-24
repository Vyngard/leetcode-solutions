class Solution:
    def sortJumbled(self, mapping: List[int], nums: List[int]) -> List[int]:
        my_dict = dict()
        for num in nums:
            mapped_value = 0
            index = 1
            temp = num
            while True:
                digit = temp % 10
                mapped_value += mapping[digit] * index
                temp //= 10
                index *= 10
                if temp == 0:
                    break
            my_dict[num] = mapped_value

        return sorted(nums, key= lambda n: my_dict[n])