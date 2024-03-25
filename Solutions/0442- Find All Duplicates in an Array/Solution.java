class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        for (int i = 0; i < nums.length; ++i) {
            while (nums[i] != nums[nums[i] - 1]) {
                var temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i +1) {
                answer.add(nums[i]);
            }
        }

        return answer;
    }
}