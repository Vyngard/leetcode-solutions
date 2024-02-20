class NumArray:
    my_array = []

    def __init__(self, nums: List[int]):
        self.my_array = nums
        

    def sumRange(self, left: int, right: int) -> int:
        sum = 0
        while left <= right:
            sum +=  self.my_array[left]
            left += 1
        return sum