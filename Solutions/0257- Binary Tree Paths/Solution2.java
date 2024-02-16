import java.util.ArrayList;
import java.util.List;

class Solution {
    private List<String> answer = new ArrayList<>();
    private List<String> tempArray = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        dfs(root);
        return answer;
    }
    private void dfs(TreeNode root) {
        if (root == null)
            return;


        tempArray.add(root.val + "");

        if (root.left == null && root.right == null) {
            answer.add(String.join("->", tempArray));
        } else {
            dfs(root.left);
            dfs(root.right);
        }
        tempArray.removeLast();
    }
}