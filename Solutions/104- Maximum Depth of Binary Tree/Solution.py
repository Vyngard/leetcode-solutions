class Solution:
    def maxDepth(self, root: Optional[TreeNode]) -> int:
        if root is None:
            return 0

        depth_left = self.maxDepth(root.left)
        depth_right = self.maxDepth(root.right)

        return max(depth_left,depth_right) + 1