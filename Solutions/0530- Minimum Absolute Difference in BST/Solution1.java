import java.util.PriorityQueue;
import java.util.Stack;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int getMinimumDifference(TreeNode root) {
        if (root == null)
            return 0;

        Stack<TreeNode> stack = new Stack<>();
        int answer = Integer.MAX_VALUE;
        stack.add(root);

        while (!stack.isEmpty()) {
            int diff = Integer.MAX_VALUE;
            root = stack.pop();
            var left = root;

            if (left.left != null) {
                left = left.left;
                stack.add(left);

                while (left.right != null) {
                    left = left.right;
                }

                diff = Math.abs(left.val - root.val);
            }

            var right = root;

            if (right.right != null) {
                right = right.right;
                stack.add(right);

                while (right.left != null) {
                    right = right.left;
                }
                
                diff = Math.min(diff, Math.abs(right.val - root.val));
            }
            
            answer = Math.min(diff, answer);
            
            if (answer == 0)
                return 0;
        }

        return answer;

    }
}