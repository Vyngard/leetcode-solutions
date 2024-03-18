class Solution:
    def __init__(self):
        self.firstMin = None
        self.secondMin = -1
    
    def findSecondMinimumValue(self, root: TreeNode) -> int:
        if root is None:
            return -1
        
        self.firstMin = root.val
        self.dfs(root)
        return self.secondMin if self.secondMin != -1 else -1

    def dfs(self, root: TreeNode):
        if root is None:
            return
        
        if self.firstMin != root.val and (self.secondMin == -1 or root.val < self.secondMin):
            self.secondMin = root.val

        self.dfs(root.left)
        self.dfs(root.right)
