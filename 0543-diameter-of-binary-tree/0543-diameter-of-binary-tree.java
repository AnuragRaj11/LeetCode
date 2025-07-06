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
    int dia=0;
    public int diameterOfBinaryTree(TreeNode root) {
        hei(root);
        return dia;
    }
    int hei(TreeNode node){
        if(node==null) return 0;
        int L=hei(node.left);
        int R=hei(node.right);
        dia=Math.max(dia,L+R);
        return Math.max(L,R)+1;
    }
}