class Solution {

    Map<Integer, Integer> map = new HashMap<>();
    public int[] findMode(TreeNode root) {
        if (root == null)
            return null;
        
        dfs(root);
        int maxValue = map.values().stream().max(Integer::compare).orElse(Integer.MIN_VALUE);
        List<Integer> keysWithMaxValue = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxValue) {
                keysWithMaxValue.add(entry.getKey());
            }
        }
        return keysWithMaxValue.stream().mapToInt(i -> i).toArray();
    }

    private void dfs(TreeNode root) {
        if (root == null)
            return;

        if (map.containsKey(root.val))
            map.put(root.val, map.get(root.val) + 1);
        else
            map.put(root.val, 1);

        dfs(root.left);
        dfs(root.right);

    }
}