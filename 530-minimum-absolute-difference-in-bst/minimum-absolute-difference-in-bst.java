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
    TreeNode prev=null;
    public int getMinimumDifference(TreeNode root) {
        int[] min=new int[1];
        min[0]=Integer.MAX_VALUE;
        findMin(root,min);
        return min[0];
    }

    void findMin(TreeNode node,int[] min){
        if(node==null){
            return;
        }

        findMin(node.left,min);
        if(prev!=null){
            min[0]=Math.min(min[0],Math.abs(prev.val-node.val
            ));
        }
        prev=node;
        
        findMin(node.right,min);
        

        
    }
}