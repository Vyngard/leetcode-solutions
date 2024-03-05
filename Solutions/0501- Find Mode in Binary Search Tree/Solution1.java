import java.util.ArrayList;
import java.util.List;

class Solution {
    private Integer previous = null;
    private int count = 1;
    private int max = 0;
    List<Integer> answer = new ArrayList<>();

    public int[] findMode(TreeNode root) {
        inorder(root);

        int[] result = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }
        return result;
    }

    private void inorder(TreeNode root) {
        if (root == null)
            return;

        inorder(root.left);

        if (previous != null) {
            if (root.val == previous)
                count++;
            else
                count = 1;
        }

        if (count > max) {
            max = count;
            answer.clear();
            answer.add(root.val);
        } else if (count == max) {
            answer.add(root.val);
        }

        previous = root.val;

        inorder(root.right);
    }
}
