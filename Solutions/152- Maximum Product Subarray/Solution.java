class Solution {
    public int maxProduct(int[] nums) {
        if (nums.length == 1)
            return nums[0];


        int max = 1, min = 1;
        int answer = 0;

        for (var num : nums) {
            if (num == 0) {
                min = 1;
                max = 1;
                continue;
            }
            var temp_min = min * num;
            var temp_max = max * num;
            min = Math.min(Math.min(temp_min, temp_max), num);
            max = Math.max(Math.max(temp_min, temp_max), num);

            answer = Math.max(max, answer);
        }

        return answer;
    }
}