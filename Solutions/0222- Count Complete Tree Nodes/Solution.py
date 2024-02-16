class Solution:
    def countNodes(self, root: Optional[TreeNode]) -> int:
        if root is None:
            return 0
        
        left = self.countNodes(root.left)
        right = self.countNodes(root.right)

        return left + right + 1