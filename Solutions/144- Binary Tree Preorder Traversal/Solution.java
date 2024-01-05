import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        ArrayList<Integer> array = new ArrayList<>();

        if (root == null)
            return array;

        stack.add(root);

        while (!stack.isEmpty()) {
            root = stack.pop();
            array.add(root.val);

            if (root.right != null)
                stack.add(root.right);
            
            if (root.left != null)
                stack.add(root.left);

        }

        return array;
    }
}