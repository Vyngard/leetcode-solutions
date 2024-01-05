class Solution:
    def preorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        array = list()

        if root is None:
            return []

        array.extend(self.preorderTraversal(root.left))
        array.extend(self.preorderTraversal(root.right))
        array.append(root.val)


        return array