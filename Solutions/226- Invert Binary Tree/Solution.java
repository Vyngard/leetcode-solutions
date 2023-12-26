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
    
    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return null;

        var left_node = invertTree(root.left);
        var right_node = invertTree(root.right);

        root.left = right_node;
        root.right = left_node;

        return root;
    }
}