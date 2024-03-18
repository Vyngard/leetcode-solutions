class Solution:
    def searchBST(self, root: Optional[TreeNode], val: int) -> Optional[TreeNode]:
        while root is not None:
            if val > root.val:
                root = root.right
            elif val < root.val:
                root = root.left
            else:
                return root
        
        return None
        