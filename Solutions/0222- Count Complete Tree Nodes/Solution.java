class Solution {
    public int countNodes(TreeNode root) {
        if (root == null)
            return 0;

        int left = 1;
        var leftNode = root;

        int right = 1;
        var rightNode = root;

        while (leftNode.left != null) {
            leftNode = leftNode.left;
            left++;
        }

        while (rightNode.right != null) {
            rightNode = rightNode.right;
            right++;
        }

        if (right == left) {
            return (int) Math.pow(2,left) - 1;
        }

        return countNodes(root.left) + countNodes(root.right) + 1;
    }
}