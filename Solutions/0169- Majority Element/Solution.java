import java.util.Arrays;

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int left = 0;
        int n = nums.length;

        while (left < nums.length) {
            int counter = 0;
            int number = nums[left];

            while (left < nums.length && nums[left] == number) {
                left++;
                counter++;
            }

            if (counter > (n/2))
                return number;
        }

        return -1;
    }
}