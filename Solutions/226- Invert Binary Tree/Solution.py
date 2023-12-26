class Solution:
    def invertTree(self, root: Optional[TreeNode]) -> Optional[TreeNode]:
        if root is None:
            return None

        left_node = self.invertTree(root.left)
        right_node = self.invertTree(root.right)

        root.left = right_node
        root.right = left_node

        return root