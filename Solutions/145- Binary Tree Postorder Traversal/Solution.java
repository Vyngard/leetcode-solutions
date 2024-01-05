import java.util.*;

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        Set<TreeNode> set = new HashSet<>();
        ArrayList<Integer> array = new ArrayList<>();

        if (root == null)
            return array;

        stack.add(root);
        set.add(null);

        while (!stack.isEmpty()) {

            root = stack.peek();

            if (set.contains(root.left) && set.contains(root.right)) {
                root = stack.pop();
                array.add(root.val);
                set.add(root);
                continue;
            }

            if (root.right != null && !set.contains(root.right))
                stack.add(root.right);

            if (root.left != null && !set.contains(root.left))
                stack.add(root.left);


        }

        return array;
    }
}