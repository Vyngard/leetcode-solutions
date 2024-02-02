import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null)
            return new ArrayList<>();

        var left = preorderTraversal(root.left);
        var right = preorderTraversal(root.right);

        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(root.val);
        answer.addAll(left);
        answer.addAll(right);

        return answer;
    }

}