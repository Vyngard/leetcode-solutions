import java.util.HashMap;
import java.util.Map;

class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int left = 0;
        int right = 0;
        int answer = 0;

        while (left <= right && right < nums.length) {
            if (!map.containsKey(nums[right])) {
                map.put(nums[right], 1);
                right++;
            } else if (map.get(nums[right]) < k) {
                map.put(nums[right], map.get(nums[right]) + 1);
                right++;
            } else {
                answer = Math.max(answer, (right - left));
                while (map.get(nums[right]) >= k) {
                    map.put(nums[left], map.get(nums[left]) - 1);
                    left++;
                }
            }
        }

        return Math.max(answer, (right - left));
    }
}