class Solution:
    def isBalanced(self, root: Optional[TreeNode]) -> bool:

        def height(root):
            if not root:
                return 0

            right = height(root.right)
            left = height(root.left)

            if abs(left - right) > 1 or left == -2 or right == -2:
                return -2

            return max(right, left) + 1

        return height(root) != -2