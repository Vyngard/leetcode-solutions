class Solution:
    def countPairs(self, root: TreeNode, distance: int) -> int:
        global count
        count = 0
        self.dfs(root,distance)
        return count

    def dfs(self, root, distance):
        global count
        if root is None:
            return []
        if root.left is None and root.right is None:
            return [1]

        left = self.dfs(root.left, distance)
        right = self.dfs(root.right, distance)

        for l in left:
            for r in right:
                if l + r <= distance:
                    count += 1

        leaves = list()
        for l in left:
            if l + 1 < distance:
                leaves.append(l + 1)

        for r in right:
            if r + 1 < distance:
                leaves.append(r + 1)

        return leaves