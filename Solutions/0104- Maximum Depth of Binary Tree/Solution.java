class Solution {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


    
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int depth_right = maxDepth(root.right);
        int depth_left = maxDepth((root.left));

        return Math.max(depth_left,depth_right) + 1;
    }
}