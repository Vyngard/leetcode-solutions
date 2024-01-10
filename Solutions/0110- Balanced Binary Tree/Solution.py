class Solution:
    def isBalanced(self, root: Optional[TreeNode]) -> bool:

        def height(root):
            if not root:
                return 0

            right_height = height(root.right)
            left_height = height(root.left)

            if abs(left_height - right_height) > 1 or left_height == -2 or right_height == -2:
                return -2

            return max(right_height, left_height) + 1

        return height(root) >= 0