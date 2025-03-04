# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def recoverFromPreorder(self, traversal: str) -> Optional[TreeNode]:
        root = TreeNode()
        travel = ''
        lv = 0
        i = 0
        while i < len(traversal):
            if traversal[i] == '-':
                lv -= 1
                i+=1
            else:
                if lv != 0:
                    travel += '(' +str(lv) + ')'
                    lv = 0
                while i<len(traversal) and traversal[i] != '-':
                    travel += traversal[i]
                    i+= 1
        def dfs(node, lvl, trvl):
            splt = trvl.split('(' +str(lvl) + ')')
            node.val = int(splt[0])

            if len(splt) == 1:
                return node

            if len(splt) >= 2:
                node.left = dfs(TreeNode(), lvl-1,splt[1])
            else:
                node.left = None

            if len(splt) == 3:
                node.right = dfs(TreeNode(), lvl-1,splt[2])
            else:
                node.right = None
            return node

        return dfs(root,-1,travel)