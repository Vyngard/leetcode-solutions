class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int depth_right = maxDepth(root.right);
        int depth_left = maxDepth((root.left));

        return Math.max(depth_left,depth_right) + 1;
    }
}