class Solution:
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        if not root:
            return []
        
        answer = []
        queue = [root]

        while queue:
            temp = []
            n = len(queue)
            while n > 0:
                node = queue.pop(0)
                temp.append(node.val)

                if node.left:
                    queue.append(node.left)
                
                if node.right:
                    queue.append(node.right)
                
                n -= 1

            answer.append(temp)
        
        return answer
