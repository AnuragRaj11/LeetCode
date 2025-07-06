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
        int maxi[] =new int[1];
        maxi[0]=Integer.MIN_VALUE;
        maxd(root,maxi);
        return maxi[0];
    }
    int maxd(TreeNode node,int maxi[]){
        if(node==null) return 0;
        int L=Math.max(0,maxd(node.left,maxi));
        int R=Math.max(0,maxd(node.right,maxi));
        maxi[0]=Math.max(maxi[0],L+R+node.val);
        return Math.max(L,R)+node.val;
    }
}