class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null)
            return false;

        targetSum -= root.val;

        if (targetSum == 0 && root.right == null && root.left == null)
            return true;

        boolean right = hasPathSum(root.right, targetSum);
        boolean left = hasPathSum(root.left, targetSum);


        return right || left;
    }

}