class Solution {
    int count = 0;

    public int countPairs(TreeNode root, int distance) {
        dfs(root,distance);
        return count;
    }

    private List<Integer> dfs(TreeNode root, int distance) {
        if (root == null)
            return new ArrayList<>();

        if (root.left == null && root.right == null) {
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            return temp;
        }

        List<Integer> left = dfs(root.left, distance);
        List<Integer> right = dfs(root.right, distance);

        for (int l : left) {
            for (int r : right) {
                if (l + r <= distance)
                    count++;
            }
        }

        List<Integer> leaves = new ArrayList<>();
        
        for (int l : left) {
            if (l + 1 < distance)
                leaves.add(l + 1);
        }
        
        for (int r : right) {
            if (r + 1 < distance)
                leaves.add(r + 1);
        }

        return leaves;
    }
}