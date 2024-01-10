class Solution {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;

        int[] prefix = new int[length];
        int[] postfix = new int[length];


        prefix[0] = nums[0];

        for (int i = 1; i < length; i++) {
            prefix[i] = prefix[i - 1] * nums[i];
        }

        postfix[length - 1] = nums[length - 1];

        for (int i = length - 2; i >= 0; i--) {
            postfix[i] = postfix[i + 1] * nums[i];
        }

        nums[0] = postfix[1];
        nums[length - 1] = prefix[length - 2];

        for (int i = 1; i < length - 1; i++) {
            nums[i] = prefix[i - 1] * postfix[i + 1];
        }

        return nums;
    }
}
