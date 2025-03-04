import javax.swing.tree.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class feb22 {
    public TreeNode tree(int[] preorder, int pres, int pree, int[] postorder, int poss, int pose){
        if(pres> pree || poss> pose) return null;
        TreeNode root= new TreeNode(preorder[pres]);
        if(pres== pree) return root;
        int leftch= preorder[pres+1];
        int leftpo= -1;
        for(int i=poss; i<=pose; i++){
            if(postorder[i]==leftch){
                leftpo=i;
                break;
            }
        }

        int lefts= leftpo-poss+1;
        root.left= tree(preorder, pres+1, pres+ lefts, postorder, poss, leftpo);
        root.right= tree(preorder, pres+lefts+1, pree, postorder, leftpo+1, pose-1);
        return root;
    }
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        TreeNode root= tree(preorder, 0, preorder.length-1, postorder, 0, postorder.length-1);
        return root;
    }
}