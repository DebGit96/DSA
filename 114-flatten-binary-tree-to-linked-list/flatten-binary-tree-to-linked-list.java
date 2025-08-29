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
class Solution {
    public void flatten(TreeNode root) {
        flattenAndFindTail(root);
    }

    public TreeNode flattenAndFindTail(TreeNode node){
        if(node==null){
            return node;
        }

        TreeNode leftTail=flattenAndFindTail(node.left);
        TreeNode rightTail=flattenAndFindTail(node.right);

        if(leftTail!=null){
            leftTail.right=node.right;
            node.right=node.left;
        }
        node.left=null;

        if(rightTail!=null){
            return rightTail;
        }

        else if(leftTail!=null){
            return leftTail;
        }
        else{
            return node;
        }
    }
}