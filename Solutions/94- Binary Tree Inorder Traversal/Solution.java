import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null)
            return new ArrayList<>() {};

        var left_list = inorderTraversal(root.left);
        var right_list = inorderTraversal(root.right);


        ArrayList<Integer> final_list = new ArrayList<>();

        final_list.addAll(left_list);
        final_list.add(root.val);
        final_list.addAll(right_list);

        return final_list;

    }
}