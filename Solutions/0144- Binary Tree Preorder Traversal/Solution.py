class Solution:
    def preorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        array = list()

        if root is None:
            return []

        array.append(root.val)
        array.extend(self.preorderTraversal(root.left))
        array.extend(self.preorderTraversal(root.right))

        return array