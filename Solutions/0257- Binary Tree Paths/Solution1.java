import java.sql.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null)
            return null;

        Queue<TreeNode> queue = new LinkedList<>();
        List<String> answer = new ArrayList<>();
        List<String> tempQueue = new ArrayList<>();

        queue.add(root);
        tempQueue.add(String.valueOf(root.val));

        while (!queue.isEmpty()) {
            var current = queue.remove();
            var text = tempQueue.removeFirst();

            if (current.left == null && current.right == null)
                answer.add(text);

            if (current.left != null) {
                String temp = text + "->" + current.left.val;
                tempQueue.add(temp);
                queue.add(current.left);
            }


            if (current.right != null) {
                String temp = text + "->" + current.right.val;
                tempQueue.add(temp);
                queue.add(current.right);
            }

        }

        return answer;
    }

}