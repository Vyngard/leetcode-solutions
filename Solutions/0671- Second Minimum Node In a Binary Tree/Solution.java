class Solution {
    int firstMin;
    int secondMin = -1;

    public int findSecondMinimumValue(TreeNode root) {
        firstMin = root.val;
        dfs(root);
        return secondMin;

    }

    private void dfs(TreeNode root) {

        if (root.val != firstMin && (secondMin == -1 || root.val < secondMin)) {
            secondMin = root.val;
        }

        if (root.left != null) {
            dfs(root.left);
            dfs(root.right);
        }
    }
}