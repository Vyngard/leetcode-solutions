import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null)
            return new ArrayList<>();

        var left = postorderTraversal(root.left);
        var right = postorderTraversal(root.right);

        ArrayList<Integer> answer = new ArrayList<>();
        answer.addAll(left);
        answer.addAll(right);
        answer.add(root.val);

        return answer;
    }

}