import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> answer = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (i-1 >= 0 && nums[i] == nums[i-1])
                continue;
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum > 0)
                    right--;
                else if (sum < 0)
                    left++;
                else {
                    answer.add(List.of(nums[i], nums[left], nums[right]));
                    do {
                        left++;
                        right--;
                    } while (left < right && nums[left] == nums[left - 1] && nums[right] == nums[right + 1]);
                }

            }
        }

        return answer;
    }
}