class Solution:
    def maxSubarrayLength(self, nums: List[int], k: int) -> int:
        map_count = defaultdict(int)
        left = 0
        right = 0
        answer = 0

        while left <= right and right < len(nums):
            if map_count[nums[right]] < k:
                map_count[nums[right]] += 1
                right += 1
            else:
                answer = max(answer, right - left)
                while map_count[nums[right]] >= k:
                    map_count[nums[left]] -= 1
                    left += 1

        return max(answer, right - left)
        