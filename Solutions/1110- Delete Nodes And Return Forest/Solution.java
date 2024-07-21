class Solution {
    Set<Integer> toDeleteSet = new HashSet<>();
    List<TreeNode> answer = new ArrayList<>();
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        for (int i : to_delete) {
            toDeleteSet.add(i);
        }

        boolean myRoot = dfs(root);

        if (myRoot)
            answer.add(root);
        else {
            if (root.left != null)
                answer.add(root.left);
            if (root.right != null)
                answer.add(root.right);
        }

        return answer;
    }

    private boolean dfs(TreeNode root) {
        if (root == null)
            return true;


        boolean left = dfs(root.left);
        boolean right = dfs(root.right);

        if (!right) {
            if (root.right.left != null)
                answer.add(root.right.left);
            if (root.right.right != null)
                answer.add(root.right.right);
            root.right = null;
        }

        if (!left) {
            if (root.left.left != null)
                answer.add(root.left.left);
            if (root.left.right != null)
                answer.add(root.left.right);
            root.left = null;
        }

        return !toDeleteSet.contains(root.val);
    }

}