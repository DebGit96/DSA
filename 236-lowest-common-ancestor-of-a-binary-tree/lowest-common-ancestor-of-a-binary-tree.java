/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode node, TreeNode p, TreeNode q) {

        if(node==null || node==p ||node==q){
            return node;
        }

        TreeNode leftLCA=lowestCommonAncestor(node.left,p,q);
        TreeNode rightLCA=lowestCommonAncestor(node.right,p,q);

        if(leftLCA !=null && rightLCA!=null){
            return node;
        }
        else if(leftLCA==null){
            return rightLCA;
        }
        else {
            return leftLCA;
        }

        
    }
}