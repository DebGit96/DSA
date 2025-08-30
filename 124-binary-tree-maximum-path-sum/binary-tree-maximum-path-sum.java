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
    public int maxPathSum(TreeNode root) {
        int[] max=new int[1];
        max[0]= Integer.MIN_VALUE; //min_value is selected so that even if theres only negative nodes max sum of 0 is not resulted
        pathSum(root,max);
        return max[0];
    }

    public int pathSum(TreeNode node,int[] max){
        if(node == null){
            return 0;
        }

        int lP=Math.max(0,pathSum(node.left,max));  // max with 0 is done to ignore negative sums (as negative sums would never contribute to max sum) from the left and right subtrees

        int rP=Math.max(0,pathSum(node.right,max)); 

        max[0]=Math.max(max[0],node.val+lP+rP);

        return node.val+Math.max(lP,rP);

    }
}