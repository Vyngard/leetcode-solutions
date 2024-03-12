from heapq import heappush, heappop
from typing import List

class Solution:
    def thirdMax(self, nums: List[int]) -> int:
        min_heap = []
        unique_nums = set()

        for num in nums:
            if len(min_heap) < 3 and num not in unique_nums:
                heappush(min_heap, num)
                unique_nums.add(num)
            elif num > min_heap[0] and num not in unique_nums:
                heappop(min_heap)
                heappush(min_heap, num)
                unique_nums.add(num)

        if len(min_heap) == 3:
            return heappop(min_heap)

        return max(min_heap)
        