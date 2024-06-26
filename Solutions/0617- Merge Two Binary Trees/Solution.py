class Solution:
    def mergeTrees(self, root1: Optional[TreeNode], root2: Optional[TreeNode]) -> Optional[TreeNode]:
        if not root1:
            return root2
        elif not root2:
            return root1
        
        main = TreeNode(root1.val + root2.val)
        main.left = self.mergeTrees(root1.left, root2.left)
        main.right = self.mergeTrees(root1.right, root2.right)

        return main