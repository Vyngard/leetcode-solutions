import java.util.*;

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        ArrayList<Integer> answer = new ArrayList<>();
        Set<TreeNode> set = new HashSet<>();

        if (root == null)
            return answer;

        stack.add(root);

        while (!stack.isEmpty()) {
            root = stack.peek();

            if (root.left != null  && !set.contains(root.left))
                stack.add(root.left);
            else {
                var temp = stack.pop();
                answer.add(temp.val);
                set.add(temp);

                if (temp.right != null)
                    stack.add(temp.right);
            }
        }

        return answer;
    }

}