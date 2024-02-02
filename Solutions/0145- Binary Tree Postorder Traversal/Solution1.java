import java.util.*;

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        Set<TreeNode> set = new HashSet<>();
        ArrayList<Integer> answer = new ArrayList<>();

        if (root == null)
            return answer;


        stack.add(root);
        set.add(null); // you add null so you can consider the leafs

        while (!stack.isEmpty()) {
            root = stack.peek();

            if (root.right != null && !set.contains(root.right))
                stack.add(root.right);

            if (root.left != null && !set.contains(root.left))
                stack.add(root.left);

            if (set.contains(root.left) && set.contains(root.right)) {
                var temp = stack.pop();
                answer.add(temp.val);
                set.add(temp);
            }

        }

        return answer;
    }
}
