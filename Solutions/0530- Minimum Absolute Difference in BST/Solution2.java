class Solution {
    private int answer;
    private int previous;

    public int getMinimumDifference(TreeNode root) {
        answer = Integer.MAX_VALUE;
        previous = Integer.MAX_VALUE;
        dfs(root);
        return answer;
    }

    private void dfs(TreeNode root) {
        if (root == null)
            return;
        

        dfs(root.left);
        answer = Math.min(answer, Math.abs(root.val - previous));
        previous = root.val;
        dfs(root.right);
    }
}