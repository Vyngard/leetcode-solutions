class Solution:
    def isSymmetric(self, root: Optional[TreeNode]) -> bool:
        queue = []

        queue.append(root.left)
        queue.append(root.right)

        while queue:
            tempRight = queue.pop()
            tempLeft = queue.pop()

            if tempLeft is None and tempRight is None:
                continue

            if tempRight is None and tempLeft or tempLeft is None and tempRight or tempLeft.val != tempRight.val:
                return False

            queue.append(tempLeft.left)
            queue.append(tempRight.right)
            queue.append(tempLeft.right)
            queue.append(tempRight.left)


        return True