class Solution:
    def evaluateTree(self, root: Optional[TreeNode]) -> bool:
        if not root.left and not root.right:
            if root.val == 1:
                return True
            else:
                return False
        
        left = self.evaluateTree(root.left)
        right = self.evaluateTree(root.right)

        if (root.val == 2):
            return left or right
        else:
            return left and right