class Solution:
    def delNodes(self, root: Optional[TreeNode], to_delete: List[int]) -> List[TreeNode]:
        global my_set, answer
        my_set = set()
        answer = []
        for item in to_delete:
            my_set.add(item)

        my_root = self.dfs(root)

        if my_root:
            answer.append(root)
        else:
            if root.left is not None:
                answer.append(root.left)
            if root.right is not None:
                answer.append(root.right)

        return answer


    def dfs(self, root: Optional[TreeNode]):
        global my_set, answer

        if root is None:
            return True

        left = self.dfs(root.left)
        right = self.dfs(root.right)

        if not right:
            if root.right.left is not None:
                answer.append(root.right.left)
            if root.right.right is not None:
                answer.append(root.right.right)
            root.right = None

        if not left:
            if root.left.left is not None:
                answer.append(root.left.left)
            if root.left.right is not None:
                answer.append(root.left.right)
            root.left = None

        if root.val in my_set:
            return False

        return True