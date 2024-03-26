
class Solution {
    public int sumNumbers(TreeNode root) {
        if (root == null)
            return 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int answer = 0;
        int offset = 10;

        while (!queue.isEmpty()) {
            int n = queue.size();

            while (n > 0) {
                TreeNode node = queue.remove();

                if (node.left == null && node.right == null) {
                    answer += node.val;
                }
                if (node.left != null) {
                    node.left.val += (offset * node.val);
                    queue.add(node.left);
                }
                if (node.right != null){
                    node.right.val += (offset * node.val);
                    queue.add(node.right);
                }
                n--;
            }

        }

        return answer;

    }

}