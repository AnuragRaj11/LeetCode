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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        pre(root,ans);
        return ans;
    }
    static void pre(TreeNode node,List<Integer> ans){
        if(node!=null){
            ans.add(node.val);
            pre(node.left,ans);
            pre(node.right,ans);
        }
    }
}