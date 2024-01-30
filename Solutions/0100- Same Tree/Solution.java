class Solution {
    public boolean isSymmetric(TreeNode root) {
        return isSymmetric(root.left, root.right);
    }

    private boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null)
            return true;

        if (left == null && right != null || left != null && right == null || left.val != right.val)
            return false;

        var side1 = isSymmetric(left.left, right.right);
        var side2 = isSymmetric(left.right, right.left);

        return side1 && side2;
    }

}