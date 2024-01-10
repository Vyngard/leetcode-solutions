class Solution {
    public boolean isBalanced(TreeNode root) {
        return height(root) >= 0;
    }

    private int height(TreeNode root) {
        if (root == null)
            return 0;

        int left_height = height(root.left);
        int right_height = height(root.right);

        if (Math.abs(left_height - right_height) > 1 || left_height == -2 || right_height == -2)
            return -2;

        return Math.max(left_height,right_height) + 1;
    }


}