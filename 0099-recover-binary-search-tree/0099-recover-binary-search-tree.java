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
    TreeNode f=null,s=null,prev=null;
    public void recoverTree(TreeNode root) {
        inorder(root);
        int temp=f.val;
        f.val=s.val;
        s.val=temp;
    }
    void inorder(TreeNode node){
        if(root==null) return;
        inorder(node.left);
        if(!prev=null && prev,val>node.val){
            if(f==null) f=prev;
            s=node;
        }
        prev=node;
        inorder(node.right);
    }
}