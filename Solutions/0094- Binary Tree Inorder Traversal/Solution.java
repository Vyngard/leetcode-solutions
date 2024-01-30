import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null)
            return new ArrayList<>();


        var left = inorderTraversal(root.left);
        var right = inorderTraversal(root.right);

        ArrayList<Integer> temp = new ArrayList<>();
        temp.addAll(left);
        temp.add(root.val);
        temp.addAll(right);

        return temp;
    }

}