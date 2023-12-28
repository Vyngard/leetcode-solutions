class Solution:
    def inorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        answer = []
        stack = []

        while root or stack:
            if root:
                stack.append(root)
                root = root.left
            else:
                item = stack.pop()
                answer.append(item.val)
                root = item.right


        return answer
        