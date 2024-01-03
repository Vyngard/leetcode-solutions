import heapq
from typing import List


class Solution:
    def findKthLargest(self, nums: List[int], k: int) -> int:
        max_heap = []

	# Iterate through the array elements
        for num in nums:
            # Push the negative of the current element onto the max heap
            heapq.heappush(max_heap, num)

            # If the size of the max heap exceeds K, remove the largest element
            if len(max_heap) > k:
                heapq.heappop(max_heap)

        # Return the Kth smallest element (top of the max heap, negated)
        return max_heap[0]