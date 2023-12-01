class Solution:
    def maxArea(self, height):
        left = 0
        right = len(height) - 1
        area = 0
        temp = 0

        while left < right:
            temp = (right - left) * min(height[left],height[right])

            if temp > area:
                area = temp

            if height[left] < height[right]:
                left += 1
            else:
                right -= 1

        return area
