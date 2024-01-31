class Solution:
    def hasPathSum(self, root: Optional[TreeNode], targetSum: int) -> bool:
        if not root:
            return False

        targetSum -= root.val

        if targetSum == 0 and not root.left and not root.right:
            return True

        right = self.hasPathSum(root.right, targetSum)
        left = self.hasPathSum(root.left, targetSum)

        return right or left